package com.ram.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EMail
{
	private JavaMailSender javaMailSender;
	private SimpleMailMessage simpleMailMessage;

	public void setMailSender(JavaMailSender javaMailSender)
	{
		this.javaMailSender = javaMailSender;
	}

	public SimpleMailMessage getSimpleMailMessage()
	{
		return simpleMailMessage;
	}

	public void setSimpleMailMessage(
			SimpleMailMessage simpleMailMessage)
	{
		this.simpleMailMessage = simpleMailMessage;
	}

	public void sendMail(String name, String message)
	{
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try
		{
			MimeMessageHelper helper = new MimeMessageHelper(
					mimeMessage, true);
			
			helper.setFrom(simpleMailMessage.getFrom());
			helper.setTo(simpleMailMessage.getTo());
			helper.setSubject(simpleMailMessage.getSubject());
			helper.setText(String.format(
				simpleMailMessage.getText(), name, message));
			
			FileSystemResource file = new FileSystemResource("D:\\work\\tree.jpg");
			helper.addAttachment(file.getFilename(), file);		
			javaMailSender.send(mimeMessage);
		}
		catch (MessagingException e)
		{
			e.printStackTrace();
		}

	}
}

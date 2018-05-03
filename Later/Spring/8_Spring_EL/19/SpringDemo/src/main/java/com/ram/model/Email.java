package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("email")
public class Email
{

	@Value("ram@yahoo.com")
	private String emailId;

	@Value("100")
	private String contentId;

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getContentId()
	{
		return contentId;
	}

	public void setContentId(String contentId)
	{
		this.contentId = contentId;
	}

	@Override
	public String toString()
	{
		return "Email [emailId=" + emailId + ", contentId=" + contentId + "]";
	}

}

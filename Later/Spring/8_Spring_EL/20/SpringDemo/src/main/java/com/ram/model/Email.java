package com.ram.model;

public class Email
{

	private String emailId;
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

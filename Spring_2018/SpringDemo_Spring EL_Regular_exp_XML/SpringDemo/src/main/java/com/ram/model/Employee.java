package com.ram.model;

public class Employee
{
	private int id;
	private String name;

	private String digitRegEx = "\\d+";

	private String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)"
			+ "*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private String isValidEmail;
	private String isValidContentId;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDigitRegEx()
	{
		return digitRegEx;
	}

	public void setDigitRegEx(String digitRegEx)
	{
		this.digitRegEx = digitRegEx;
	}

	public String getEmailRegEx()
	{
		return emailRegEx;
	}

	public void setEmailRegEx(String emailRegEx)
	{
		this.emailRegEx = emailRegEx;
	}

	public String getIsValidEmail()
	{
		return isValidEmail;
	}

	public void setIsValidEmail(String isValidEmail)
	{
		this.isValidEmail = isValidEmail;
	}

	public String getIsValidContentId()
	{
		return isValidContentId;
	}

	public void setIsValidContentId(String isValidContentId)
	{
		this.isValidContentId = isValidContentId;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", isValidEmail="
				+ isValidEmail + ", isValidContentId=" + isValidContentId + "]";
	}

}

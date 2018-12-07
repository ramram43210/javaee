package com.ram.model;

public class Token
{

	private String token_type;

	private String expires_in;

	private String token;

	public String getToken_type()
	{
		return token_type;
	}

	public void setToken_type(String token_type)
	{
		this.token_type = token_type;
	}

	public String getExpires_in()
	{
		return expires_in;
	}

	public void setExpires_in(String expires_in)
	{
		this.expires_in = expires_in;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	@Override
	public String toString()
	{
		return "Token [token_type=" + token_type + ", expires_in="
				+ expires_in + ", token=" + token + "]";
	}

}

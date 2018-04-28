package com.ram.model;

public class MedicalInsurence
{
	private int insurencePolicyNumber;
	private int insuredAmount;

	public int getInsurencePolicyNumber()
	{
		return insurencePolicyNumber;
	}

	public void setInsurencePolicyNumber(int insurencePolicyNumber)
	{
		this.insurencePolicyNumber = insurencePolicyNumber;
	}

	public int getInsuredAmount()
	{
		return insuredAmount;
	}

	public void setInsuredAmount(int insuredAmount)
	{
		this.insuredAmount = insuredAmount;
	}

	@Override
	public String toString()
	{
		return "MedicalInsurence [insurencePolicyNumber="
				+ insurencePolicyNumber + ", insuredAmount=" + insuredAmount
				+ "]";
	}

}

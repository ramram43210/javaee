package com.ram.model;

public class MedicalInsurence
{
	private int insurencePolicyNumber;
	private int insuredAmount;
	private int bonusAmount;

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

	public int getBonusAmount()
	{
		return bonusAmount;
	}

	public void setBonusAmount(int bonusAmount)
	{
		this.bonusAmount = bonusAmount;
	}

	@Override
	public String toString()
	{
		return "MedicalInsurence [insurencePolicyNumber="
				+ insurencePolicyNumber + ", insuredAmount=" + insuredAmount
				+ ", bonusAmount=" + bonusAmount + "]";
	}
}

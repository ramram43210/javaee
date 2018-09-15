package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("medicalInsurence")
public class MedicalInsurence
{
	@Value("10")
	private int insurencePolicyNumber;
	
	@Value("15000")
	private int insuredAmount;
	
	@Value("2000")
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

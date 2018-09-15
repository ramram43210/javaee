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

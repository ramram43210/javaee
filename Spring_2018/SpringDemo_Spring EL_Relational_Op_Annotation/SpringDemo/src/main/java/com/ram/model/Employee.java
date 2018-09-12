package com.ram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee
{
	
	@Value("100")
	private int id;
	
	@Value("Peter")
	private String name;

	@Value("#{medicalInsurence.insuredAmount == 10000}")
	private boolean insuredAmountEqualTo10000;
	
	@Value("#{medicalInsurence.insuredAmount != 10000}")
	private boolean insuredAmountNotEqualTo10000;
	
	@Value("#{medicalInsurence.insuredAmount lt 10000}")
	private boolean insuredAmountLessThan10000;
	
	@Value("#{medicalInsurence.insuredAmount le 10000}")
	private boolean insuredAmountLessThanOrEqualTo10000;
	
	@Value("#{medicalInsurence.insuredAmount gt 10000}")
	private boolean insuredAmountGreaterThan10000;
	
	@Value("#{medicalInsurence.insuredAmount ge 10000}")
	private boolean insuredAmountGreaterThanOrEqualTo10000;

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

	public boolean isInsuredAmountEqualTo10000()
	{
		return insuredAmountEqualTo10000;
	}

	public void setInsuredAmountEqualTo10000(boolean insuredAmountEqualTo10000)
	{
		this.insuredAmountEqualTo10000 = insuredAmountEqualTo10000;
	}

	public boolean isInsuredAmountNotEqualTo10000()
	{
		return insuredAmountNotEqualTo10000;
	}

	public void setInsuredAmountNotEqualTo10000(
			boolean insuredAmountNotEqualTo10000)
	{
		this.insuredAmountNotEqualTo10000 = insuredAmountNotEqualTo10000;
	}

	public boolean isInsuredAmountLessThan10000()
	{
		return insuredAmountLessThan10000;
	}

	public void setInsuredAmountLessThan10000(
			boolean insuredAmountLessThan10000)
	{
		this.insuredAmountLessThan10000 = insuredAmountLessThan10000;
	}

	public boolean isInsuredAmountLessThanOrEqualTo10000()
	{
		return insuredAmountLessThanOrEqualTo10000;
	}

	public void setInsuredAmountLessThanOrEqualTo10000(
			boolean insuredAmountLessThanOrEqualTo10000)
	{
		this.insuredAmountLessThanOrEqualTo10000 = insuredAmountLessThanOrEqualTo10000;
	}

	public boolean isInsuredAmountGreaterThan10000()
	{
		return insuredAmountGreaterThan10000;
	}

	public void setInsuredAmountGreaterThan10000(
			boolean insuredAmountGreaterThan10000)
	{
		this.insuredAmountGreaterThan10000 = insuredAmountGreaterThan10000;
	}

	public boolean isInsuredAmountGreaterThanOrEqualTo10000()
	{
		return insuredAmountGreaterThanOrEqualTo10000;
	}

	public void setInsuredAmountGreaterThanOrEqualTo10000(
			boolean insuredAmountGreaterThanOrEqualTo10000)
	{
		this.insuredAmountGreaterThanOrEqualTo10000 = insuredAmountGreaterThanOrEqualTo10000;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name
				+ ", insuredAmountEqualTo10000=" + insuredAmountEqualTo10000
				+ ", insuredAmountNotEqualTo10000="
				+ insuredAmountNotEqualTo10000 + ", insuredAmountLessThan10000="
				+ insuredAmountLessThan10000
				+ ", insuredAmountLessThanOrEqualTo10000="
				+ insuredAmountLessThanOrEqualTo10000
				+ ", insuredAmountGreaterThan10000="
				+ insuredAmountGreaterThan10000
				+ ", insuredAmountGreaterThanOrEqualTo10000="
				+ insuredAmountGreaterThanOrEqualTo10000 + "]";
	}

}

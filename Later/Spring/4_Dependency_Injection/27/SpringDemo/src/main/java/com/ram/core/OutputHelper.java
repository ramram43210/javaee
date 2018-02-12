package com.ram.core;

public class OutputHelper
{
	private IOutputGenerator outputGenerator;

	public OutputHelper(IOutputGenerator outputGenerator)
	{
		this.outputGenerator = outputGenerator;
	}

	public IOutputGenerator getOutputGenerator()
	{
		return outputGenerator;
	}

}

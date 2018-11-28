package com.ram.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component("reportCurrentTime")
public class ReportCurrentTime
{

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm:ss");

	public void printCurrentTime()
	{
		System.out.println(
				"Current time = " + dateFormat.format(new Date()));
	}

}

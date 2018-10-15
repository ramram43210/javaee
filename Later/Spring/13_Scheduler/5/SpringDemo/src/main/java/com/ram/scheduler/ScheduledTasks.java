package com.ram.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ScheduledTasks
{
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm:ss");

	public void reportCurrentTime()
	{
		System.out.println(
				"Current time = " + dateFormat.format(new Date()));
	}
}
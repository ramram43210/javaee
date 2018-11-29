package com.ram.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.ram.scheduling.ReportCurrentTime;

public class ScheduledJob extends QuartzJobBean
{
	private ReportCurrentTime reportCurrentTime;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException
	{
		reportCurrentTime.printCurrentTime();
	}

	public ReportCurrentTime getReportCurrentTime()
	{
		return reportCurrentTime;
	}

	public void setReportCurrentTime(
			ReportCurrentTime reportCurrentTime)
	{
		this.reportCurrentTime = reportCurrentTime;
	}

}

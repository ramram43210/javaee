package com.ram.aware;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceLoaderAwareImpl implements ResourceLoaderAware
{

	private ResourceLoader resourceLoader;

	public void setResourceLoader(ResourceLoader resourceLoader)
	{

		System.out.println(
				"setResourceLoader(ResourceLoader resourceLoader) is called "
						+ "by the Spring Container");
		this.resourceLoader = resourceLoader;

	}

	public void displayFileInfo()
	{
		Resource resource = resourceLoader.getResource("classpath:names.txt");

		try (
				BufferedReader br = new BufferedReader(
						new FileReader(resource.getFile().getPath())))
		{

			String thisLine = null;

			System.out.println("Names from the files are..");
			while ((thisLine = br.readLine()) != null)
			{
				System.out.println(thisLine);
			}

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}

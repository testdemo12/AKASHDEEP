package org.Google.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utility {

	public static String getproperty(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream("./Config/Config.Properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

	public static String getlocator(String key) throws Exception {

		FileInputStream fis=new FileInputStream("./Config/Locator.Properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}}




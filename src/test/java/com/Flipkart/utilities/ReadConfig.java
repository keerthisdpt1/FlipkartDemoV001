package com.Flipkart.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	public static Properties GetPropertyData() throws Exception
	{
		FileInputStream fis = new FileInputStream("./Configuration/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
				
	}
}

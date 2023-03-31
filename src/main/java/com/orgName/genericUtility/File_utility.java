package com.orgName.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class File_utility 
{
	public String Patient(String key) throws IOException
	{
		/**
		 * THIS METHOD IS USED TO LAUNCH THE APPLICATION
		 * PARAM KEY
		 * RETURN
		 * THROWS
		 * @author Shivashankar 
		 */
		
		//FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		FileInputStream fis = new FileInputStream("./Credentials.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	public String Doctor(String key1) throws IOException
	{
		/**
		 * THIS METHOD IS USED TO LAUNCH THE APPLICATION
		 * PARAM KEY
		 * RETURN
		 * THROWS
		 * @author Shivashankar 
		 */
		
		//FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		FileInputStream fis = new FileInputStream("./DoctorCredentials.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key1);
		return value;
	}
	public String Admin(String key2) throws IOException
	{
		/**
		 * THIS METHOD IS USED TO LAUNCH THE APPLICATION
		 * PARAM KEY
		 * RETURN
		 * THROWS
		 * @author Shivashankar 
		 */
		
		//FileInputStream fis = new FileInputStream("./commondata.properties.txt");
		FileInputStream fis = new FileInputStream("./Admin_credentials.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key2);
		return value;
	}

}

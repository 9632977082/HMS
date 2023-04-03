package com.orgName.genericUtility;

import java.util.Random;

public class Java_lib 
{
	public int getRandomNum()
	{
		Random ran = new Random();
		int Ran = ran.nextInt(1000);
		return Ran;
		
	}

}

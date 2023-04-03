package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample1 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis1 = new FileInputStream("./DoctorCredentials2.txt");
		Properties pro = new Properties();
		pro.load(fis1);
		String name = pro.getProperty("DoctorName");
		System.out.println(name);
	}

}

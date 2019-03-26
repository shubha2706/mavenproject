package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class library implements Autoconstant {
	
	public static String getpropertyvalue(String propertname)
	{
		String propertyvalue = " ";
		Properties prop = new Properties();
		try
		{
FileInputStream fis = new FileInputStream(Config_path);
prop.load(fis);
propertyvalue = prop.getProperty(propertname);

		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		return propertyvalue;
		
	
	
	
	}

}

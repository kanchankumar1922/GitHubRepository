package com.examples.propertyfileexample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileTestMain {

	public static void main(String[] args) {

	  Properties properties = 	new Properties();
	  try {
		  InputStream inputStream = PropertyFileTestMain.class.getResourceAsStream("property.properties");
		  System.out.println(inputStream);
		properties.load(inputStream);
		System.out.println(properties.getProperty("admin.codeLookup.sql.getCodeLookupBySeqTypeFilter.failure"));
		String str = properties.getProperty("admin.codeLookup.sql.getCodeLookupBySeqTypeFilter.failure").replaceAll("%a%" , "KK") ;
		System.out.println(str);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}

package com.designpattern.junitTest;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.designpattern.annotations.TestAnnotation;;

public class FileExtractorTest{

	/**
	 * @param args
	 */
	@Test
	public void testingTestClassGetNameMethod(){
		System.out.println("Assert Passed");
		TestAnnotation test = new TestAnnotation();
	assertEquals("kanchan", test.getName());
	assertEquals(true, ExtractFileSubDirectories.unzip("C:\\KanchanPASA\\Projects\\Gist-The-Facts\\00 Source Code\\src\\webapp\\assets\\apps\\WiFi-App.zip"));
	System.out.println("Assert Passed");

	}
	
	
		
	
	

}




/**
 * 
 */
package com.designpatterns.strategydesignpattern2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class Client
{

	private final static String SOURCE_FOLDER = "C:\\Users\\kumark\\Desktop\\logs\\sudarshan\\15thMay\\";
   public static void main(String[] args)
   {
      CompressionContext ctx = new CompressionContext(); 
     //we could assume context is already set by preferences 
      ctx.setCompressionStrategy(new ZipCompressionStrategy()); 
      
      try {
		ctx.createArchive(getListOfFiles());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
 
   }
   
   public static List<File> getListOfFiles(){
	   
	   File fileLinks = new File(SOURCE_FOLDER + "Links.txt");
	   File fileRAM = new File(SOURCE_FOLDER + "RAMData.txt");
	   File fileROM = new File(SOURCE_FOLDER + "ROMData.txt");
	   
	   List<File> listFile = new ArrayList<File>();
	   listFile.add(fileROM);
	   listFile.add(fileRAM);
	   listFile.add(fileLinks);
	   
	   return listFile;
   }
} 

/**
 * 
 */
package com.designpatterns.strategydesignpattern2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author kumark
 *
 */
public class ZipCompressionStrategy implements CompressionStrategy {

	
	/* (non-Javadoc)
	 * @see com.designpatterns.strategydesignpattern2.CompressionStrategy#compressFiles(java.util.ArrayList)
	 */
	@Override
	public void compressFiles(List<File> files) throws FileNotFoundException , IOException{
		
		 byte[] buffer = new byte[1024];
        String absolutePath = files.get(0).getAbsolutePath();
		String zipFolderName = absolutePath.substring(0, absolutePath.lastIndexOf("\\"));
        String zipFileName = absolutePath.substring(absolutePath.lastIndexOf("\\") , absolutePath.lastIndexOf(".")) + ".zip";
		FileOutputStream fileOutputStream = new FileOutputStream(zipFolderName + zipFileName);
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
		
		FileInputStream fileInputStream = new FileInputStream(absolutePath);
		zipOutputStream.putNextEntry(new ZipEntry(absolutePath));
		
		 int length;		 
         while((length = fileInputStream.read(buffer)) > 0)
         {
        	 zipOutputStream.write(buffer, 0, length);
         }
         zipOutputStream.closeEntry();
         fileInputStream.close();
         fileOutputStream.close();
         System.out.println("Zip file has been created!");
		
	}

}

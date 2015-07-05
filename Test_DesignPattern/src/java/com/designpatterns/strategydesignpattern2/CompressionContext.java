/**
 * 
 */
package com.designpatterns.strategydesignpattern2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author kumark
 *
 */
public class CompressionContext
{
   private CompressionStrategy strategy;   

   //this can be set at runtime by the application preferences
   public void setCompressionStrategy(CompressionStrategy strategy) 
   {
       this.strategy = strategy;  
   }

  //use the strategy
   public void createArchive(List<File> files) throws FileNotFoundException , IOException 
   {
        strategy.compressFiles(files);
   }

}

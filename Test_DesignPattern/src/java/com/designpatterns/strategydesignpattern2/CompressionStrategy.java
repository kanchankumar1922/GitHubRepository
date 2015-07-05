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
public interface CompressionStrategy {

	public void compressFiles(List<File> files) throws FileNotFoundException , IOException;
}

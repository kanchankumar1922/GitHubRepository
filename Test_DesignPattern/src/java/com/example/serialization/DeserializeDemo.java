/**
 * 
 */
package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author kumark
 * 
 */
public class DeserializeDemo {
	public static Logger log = Logger.getLogger(DeserializeDemo.class.getSimpleName());
	private static String SER_FILE_NAME = "src/java/com/example/serialization/employee.ser";
	private static String LOG_FILE_HANDLER = "src/java/com/example/serialization/log";

	public static void main(String[] args) {
		log.setLevel(Level.FINE);
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream(SER_FILE_NAME);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		}catch (FileNotFoundException fnf) {
			log.severe("File Not Found Exception");
		}catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			log.severe("Employee class not found");
			c.printStackTrace();
			return;
		}
		// System.out.println("Deserialized Employee..."+e.toString());
      //log.setLevel( Level.SEVERE);
      
      try {
		Handler logHandlerAll = new FileHandler(LOG_FILE_HANDLER + "-" + Level.ALL.toString() +".log");
		Handler logHandlerSevere = new FileHandler(LOG_FILE_HANDLER + "-" + Level.SEVERE.toString() +".log");
		logHandlerAll.setLevel(Level.ALL);
		logHandlerAll.setFormatter(new SimpleFormatter());
		logHandlerSevere.setLevel(Level.SEVERE);
		logHandlerSevere.setFormatter(new SimpleFormatter());
		log.setUseParentHandlers(false);
		//log.getHandlers()
		log.addHandler(logHandlerAll);
		log.addHandler(logHandlerSevere);
		
	} catch (SecurityException | IOException e1) {
		e1.printStackTrace();
	}
      
        //log.getHandlers()[0].close();
		log.info("Deserialized Employee..." + e.toString());
		log.log(Level.WARNING, "Warnign Log Enabled :: " + e.toString());
		log.log(Level.SEVERE, "SEVERE Log Enabled :: ");
		log.log(Level.INFO, "SEVERE Log Enabled :: ");
		log.log(Level.FINE, "SEVERE Log Enabled :: ");
		// log.log(Level.SEVERE, e.toString());
		// log.log(Level.WARNING, e.toString());

	}
}

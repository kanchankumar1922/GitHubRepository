/**
 * 
 */
package com.examples.multithreading;

/**
 * @author kumark
 *
 */
class NewThreadClass implements Runnable {
	   String name; // name of thread
	   Thread t;
	   boolean suspendFlag;
	   NewThreadClass(String threadname) {
	      name = threadname;
	      t = new Thread(this, name);
	      if(this.name.equals("One"))t.setPriority(10);
	      System.out.println("New thread: " + t);
	      suspendFlag = false;
	      t.start(); // Start the thread
	   }
	   // This is the entry point for thread.
	   public void run() {
	      try {
	      for(int i = 15; i > 0; i--) {
	    	  synchronized (this) {
	    		  	if (t.getName().equals("One")) {	    	
	    		  		System.out.println("thread group name :: " + t.getThreadGroup().activeCount());
	    			 System.out.println("THREAD ONE ->> " + name + ": " + i);
       			   }
	           	    else{
	    		     System.out.println("THREAD TWO ->> " + name + ": " + i);
	    	       }
	    	  }
	         Thread.sleep(200);
	         synchronized(this) {
	            while(suspendFlag) {
	               wait();
	            }
	          }
	        }
	      } catch (InterruptedException e) {
	         System.out.println(name + " interrupted.");
	      }
	      System.out.println(name + " exiting.");
	   }
	   void mysuspend() {
	      suspendFlag = true;
	   }
	   synchronized void myresume() {
	      suspendFlag = false;
	       notify();
	   }
	}

	public class SuspendResume {
		
		private static final int MILLI_SECONDS = 1000;
	   public static void main(String args[]) {
	      NewThreadClass ob1 = new NewThreadClass("One");
	      NewThreadClass ob2 = new NewThreadClass("Two");
	      try {
	         Thread.sleep(MILLI_SECONDS);
	         ob1.mysuspend();
	         System.out.println("Suspending thread One");
	         Thread.sleep(MILLI_SECONDS);
	         ob1.myresume();
	         System.out.println("Resuming thread One");
	         ob2.mysuspend();
	         System.out.println("Suspending thread Two");
	         Thread.sleep(MILLI_SECONDS);
	         ob2.myresume();
	         System.out.println("Resuming thread Two");
	      } catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
	      }
	      // wait for threads to finish
	      try {
	         System.out.println("Waiting for threads to finish.");
	         ob1.t.join();
	         ob2.t.join();
	      } catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
	      }
	      System.out.println("Main thread exiting.");
	   }
	}

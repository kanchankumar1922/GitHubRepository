package com.examples.multithreading;

public class MyThreadDemoClass {
   public static void main(String args[]) {
      new NewThread(); // create a new thread
      //theMainThread();
   }
   
   public static void printMessage(String msg){
	   
	   synchronized (msg) {
		   System.out.println(msg);
	    }	   
   }
   
  public static void theMainThread(){
	   try {
          for(int i = 5; i > 0; i--) {
     	   MyThreadDemoClass.printMessage("Main Thread: " + i);
           Thread.sleep(1000);
	       }
	     }catch (InterruptedException e) {
	 	  MyThreadDemoClass.printMessage("Main thread interrupted.");
       }
       MyThreadDemoClass.printMessage("Main thread exiting.");
   }
  
}

class NewThread implements Runnable {
   Thread t1;
   Thread t2;
   NewThread() {
      // Create a new, second thread
      t1 = new Thread(this, "Thread 1");
      t2 = new Thread(this, "Thread 2");
      MyThreadDemoClass.printMessage("Child thread: " + t1.currentThread().getName());
      t1.start(); // Start the t1 thread
      t2.start(); // Start the t2 thread
   }
   
   // This is the entry point for the second thread.
   public void run() {
      try {
         for(int i = 3; i > 0; i--) {
        	 MyThreadDemoClass.printMessage("Child Thread: " + t1.getName() + " ::: " + i);
        	 MyThreadDemoClass.printMessage("Child Thread: " + t2.getName() + " ::: " + i);
            // Let the thread sleep for a while.
            Thread.sleep(500);
         }
     } catch (InterruptedException e) {
    	 MyThreadDemoClass.printMessage("Child interrupted.");
     }
      MyThreadDemoClass.printMessage("Exiting child thread.");
   }
}


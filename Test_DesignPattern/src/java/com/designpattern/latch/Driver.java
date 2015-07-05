/**
 * 
 */
package com.designpattern.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author kumark
 *
 */
public class Driver { // ...
	
	private static final int START_COUNTDOWN_LATCH = 1;
	private static final int END_COUNTDOWN_LATCH = 10;
	   public static void main(String[] args) throws InterruptedException {
		   
		   
	     CountDownLatch startSignal = new CountDownLatch(START_COUNTDOWN_LATCH);
	     CountDownLatch doneSignal = new CountDownLatch(END_COUNTDOWN_LATCH);

	     for (int i = 0; i < END_COUNTDOWN_LATCH; ++i) // create and start threads
	       new Thread(new Worker(startSignal, doneSignal)).start();

	     System.out.println("startSignal.getCount() :: " + startSignal.getCount()); 
		   System.out.println("doneSignal.getCount()  :: " + doneSignal.getCount());
	     doSomethingElse();     
	     System.out.println("startSignal.getCount() :: " + startSignal.getCount()); 
		   System.out.println("doneSignal.getCount()  :: " + doneSignal.getCount());// don't let run yet
	     startSignal.countDown();      // let all threads proceed
	     System.out.println("startSignal.getCount() :: " + startSignal.getCount()); 
		   System.out.println("doneSignal.getCount()  :: " + doneSignal.getCount());
	     doSomethingElse();
	     System.out.println("-----startSignal.getCount() :: " + startSignal.getCount()); 
		   System.out.println("@@@@@doneSignal.getCount()  :: " + doneSignal.getCount());
	     doneSignal.await(10000 , TimeUnit.MILLISECONDS);           // wait for all to finish
	     System.out.println("AFTER doneSignal.await();;;;");
	   }
	   
	   public static void doSomethingElse(){
		   
		   System.out.println("I AM DOING SOMETHING ELSE IN DRIVER CLASS");
	   }
	 }



class Worker implements Runnable {
	   private final CountDownLatch startSignal;
	   private final CountDownLatch doneSignal;
	   Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
	      this.startSignal = startSignal;
	      this.doneSignal = doneSignal;
	   }
	   public void run() {
		   System.out.println("!!!!!!!!! IN ACTUAL RUN METHOD !!!!!!!!");
	      try {
	        startSignal.await();
	        doWork();
	        doneSignal.countDown();
	        //doneSignal.countDown();
	        System.out.println("RUN--" + doneSignal.getCount());
	      } catch (InterruptedException ex) {} // return;
	   }

	   void doWork() {
		   System.out.println("################# THREAD STARTED ###################");
		   System.out.println("doWork startSignal.getCount() :: " + startSignal.getCount()); 
		   System.out.println(" doWork doneSignal.getCount()  :: " + doneSignal.getCount());
		  System.out.println("in Worker Class doWork Method");   
	    }
	 }

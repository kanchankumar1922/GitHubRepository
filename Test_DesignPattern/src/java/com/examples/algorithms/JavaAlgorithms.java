package com.examples.algorithms;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class JavaAlgorithms {

	private static boolean firstTime = true;
	public static void main(String[] args) {
		System.out.println("############## FIBONAACI SEQUENCE  #############");
		
		//System.out.print(0 + " ,  " + 1 + " , " );
		//fibonaciSequence(0 , 1);
		
		int [] unsortedSequence = {3 ,  7  , 4  , 9  , 5  , 2  , 6  , 1} ;
		insertionSort(unsortedSequence);

	}

	/*
	 * Fibonaaci sequesnce
	 */
	public static void fibonaciSequence(int first , int second){
	
		//int finalNumber = first + second;
		/*if(firstTime){
			firstTime = false;
			System.out.print(0 + " ,  " + 1 + " , " );
			fibonaciSequence(first , first + second);
		}
		else{
			System.out.print(first + second + " ,  ");
			if(!(first + second > 200))	fibonaciSequence(second , first + second);
			
		}*/
        System.out.print(first + second + " , " );		
		if( !(( first + second ) > 100)) fibonaciSequence(second, first + second);
		
	}
	
	public static void insertionSort(int [] unsortedSeq){
		
		for( int i = 0 ; i < unsortedSeq.length - 1 ; i++){
			if(unsortedSeq[i+1]  < unsortedSeq[i]){
				int keepPreViousValue = unsortedSeq[i];
				unsortedSeq[i] = unsortedSeq[i+1];
				unsortedSeq[i+1] = keepPreViousValue;
			}
				
			System.out.print(unsortedSeq[i] + " , ");
		}
		
	}

}

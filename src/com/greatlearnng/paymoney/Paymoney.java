package com.greatlearnng.paymoney;
import java.util.Scanner;

public class Paymoney {

	private static Scanner sc = new Scanner( System.in );
			
			public static void main( String[] args ) {
				//  size of transactions array
				System.out.println( "Enter the number of transactions done in a day :" );
				int size = sc.nextInt();
				
				
				
				
				System.out.println( "Enter the value of transactions done:" );
			//  array to save transaction
			     int[] Transarr = new int[size];
				
				for( int i = 0; i < size; i++ ) {
					Transarr[i] = sc.nextInt();
				}
				
				//  number of targets to be achieved
				System.out.println( "Enter the number of targets to be achieved for the day:" );
				int numofTargets = sc.nextInt();
						
				// loop for finding target
				for( int i = 0; i < numofTargets; i++ ) {
					// getting target value
					System.out.println( "Enter the value of target" );
					int target = sc.nextInt();
					
					// loop to calculate the sum
					int sum = 0;
					for( int j = 0; j < Transarr.length; j++ ) {
						// sum of the elements to find target
						sum = sum + Transarr[j];
						
						// check if target is reached
						if( sum >= target ) {
							// print out the number of transactions when target is reached
							System.out.println( "Target is reached after " + ( j + 1 ) + " transactions" );
							break; 
						}
						
						// we reached the final transaction and target is still not reached :(
						if( j == Transarr.length - 1 && sum < target ) {
							System.out.println( "Target is not reached" );
						}
					}
				}
			}
		
	}



package com.greatlearning.denomination;

import java.util.Scanner;
import com.greatlearning.service.*;

public class DenominationDemo {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// various types of denominations (eg. 3, if you have 10,20,20,30)
		System.out.println("Enter the number types of denominations you have");
		int size = sc.nextInt();

		

		
		System.out.println("Enter the  denominations value : ");
		// allocating array  to hold denominations
				int[] denomination = new int[size];
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}

		// sorting denomination array using merge sort
		MergeSort ms = new MergeSort();
		ms.sort(denomination, 0, denomination.length - 1);

		// check if notes are sorted in descending order
		for (int i = 0; i < size; i++) {
			System.out.println(denomination[i]);
		}

		System.out.println("Enter the amount to pay");
		int amount = sc.nextInt();

		//  For finding the denomination of currency to be paid
		for (int i = 0; i < denomination.length; i++) {
			// find out how many notes of different denomination to be paid
			int n = (int) (amount / denomination[i]);
			System.out.println(denomination[i] + " : " + n);

			// setting amount to the remaining amount
			amount = amount - (n * denomination[i]);

			// "Not possible to pay"
			if (i == denomination.length - 1 && amount != 0) {
				System.out.println("Not possible to pay");
			}
		}
	}

}

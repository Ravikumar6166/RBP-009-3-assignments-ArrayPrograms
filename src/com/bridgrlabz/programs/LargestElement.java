package com.bridgrlabz.programs;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 324, 45, 90, 120 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Largest elment from array is = " + max);

	}

}

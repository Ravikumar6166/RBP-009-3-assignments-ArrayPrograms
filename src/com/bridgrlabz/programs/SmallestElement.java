package com.bridgrlabz.programs;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 324, 45, 90, 120 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The Smallest elment from array is = " + min);

	}

}

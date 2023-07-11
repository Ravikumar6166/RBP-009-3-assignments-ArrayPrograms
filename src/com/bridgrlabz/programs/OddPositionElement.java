package com.bridgrlabz.programs;

public class OddPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 324, 45, 90, 120 };

		for (int i = 0; i < arr.length; i = i + 1) {
			if (i % 2 == 0) {
				System.out.println("The Elements of array present in OddPosition = " + arr[i]);
			}

		}
	}

}

package com.bridgrlabz.programs;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 31, 12, 80, 52, 91, 35 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Third second largest number is:: " + arr[arr.length - 2]);

	}
}

package com.bridgrlabz.programs;

public class FrequencyofElementInArray {

	public static void main(String[] args) {
		int num[] = { 12, 21, 52, 81, 21, 53, 81, 52 };
		int frq[] = new int[num.length];
		int visited = -1;

		for (int i = 0; i < num.length; i++) {
			int count = 1;

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {
					count++;
					frq[j] = visited;
				}
			}
			if (frq[i] != visited) {
				frq[i] = count;
				System.out.println(num[i] + " is " + frq[i] + " times ");
			}
		}

	}

}

package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int[] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = stdin.nextInt();
		}

		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}

		stdin.close();

	}

}

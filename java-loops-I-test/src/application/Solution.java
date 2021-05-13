package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >= 2 && n <= 20) {
			for(int i = 1; i <= 10; i++) {
				int result = n*i;
				System.out.println(n + " x " + i + " = " + result);
			}
		}
		
		sc.close();
		
	}

}

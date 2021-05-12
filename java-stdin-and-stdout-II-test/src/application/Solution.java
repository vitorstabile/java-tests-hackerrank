package application;

import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valueInt = sc.nextInt();
		sc.nextLine(); // buffer clean
		double valueDouble = sc.nextDouble();
		sc.nextLine();
		String valueString = sc.nextLine();
		
		System.out.println("String: " + valueString);
		System.out.println("Double: " + valueDouble);
		System.out.println("Int: " + valueInt);
		
		sc.close();
		
	}

}

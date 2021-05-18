package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] lines = new String[1];
		lines[0] = line;
		
		int count = 1;
		
		while(sc.hasNextLine()) {
			count = count +1;
			lines = new String[count];
			lines[count-1] = sc.nextLine();
			
		}
		
		for (String a : lines) {
			System.out.println(a);
		}
		
		
		sc.close();

	}
}

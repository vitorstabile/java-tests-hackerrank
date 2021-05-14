package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		sc.nextLine();
		
		String [] numbers = new String[test];
		
		
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = sc.nextLine();
			
			try
            {
                long x=Long.parseLong(numbers[i]);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>= -9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(numbers[i]+" can't be fitted anywhere.");
            }
			
		}
		
		sc.close();
		
		
		

	}

}

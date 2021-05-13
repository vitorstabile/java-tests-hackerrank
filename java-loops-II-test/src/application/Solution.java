package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		
		if(q >= 0 && q <= 500) {
			
			
			
			for(int i = 1; i <= q; i++) {
				
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				int n = sc.nextInt();
				
				if(a >= 0 && a <= 50 && b >= 0 && b <= 50 &&  n>= 1 && n <= 15) {
				
					int[] result = new int[n];
					
					for(int j = 0; j < n; j++) {
						int sum = a + 0;
						for(int k = 0; k <= j; k++) {
							sum = sum + (int) (Math.pow(2.0, k))*b;
						}
						result[j] = sum;
					}
					
					String s = "";
					
					for(int j = 0; j < result.length;j++) {
						s = s + (Integer.toString(result[j])) + " ";
					}
					System.out.println(s);
				}
				
			}
		}
		
		
		
		sc.close();
		
		
	}

}

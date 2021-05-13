package application;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	
            String s1=sc.next();
            int x=sc.nextInt();
            
            String[] s2 = new String[3];
            
            s2[i] = s1;
            
            if(s2[i].length() <= 10) {
            	for(int j = s2[i].length(); j<15; j++ ) {
            		s2[i] = s2[i].concat(" ");
            	}
            }
            
            if(x >= 0 && x <= 999) {
            	String n = Integer.toString(x);
            	if(n.length() < 3) {
            		if(n.contentEquals("0")) {
            			n = "0" + "0" + n;
            			s2[i] = s2[i].concat(n);
            		}
            		else {
            			n = "0" + n;
            			s2[i] = s2[i].concat(n);
            		}
            	}else {
            		s2[i] = s2[i].concat(n);
            	}
            }
            
            System.out.println(s2[i]);
            
        }
        System.out.println("================================");
		
		sc.close();
	}

}

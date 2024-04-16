package Sample_Programs;

import java.util.Scanner;

public class First_Program {
	
	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 5, 1, 6 };
		int count = 0;
		char letter[] = { 'a', 'b', 'c', 'g', 'f', 't', 'h', 'j', 'u', 'a', 'b', 'd', 'f', 'g', 'u' };

		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * a=sc.nextInt();
		 */

		
		int i = 0;
		for ( ;i <= a.length-2; i++) {
			for(int j=0;j<=9;j++) {
				if(a[i]==j)
					count++;
				else
					break;
			}
			System.out.println(a[i]+" is present "+count+" times");

			}
	
		
		//if(count!=0) {
		//System.out.println(a[i]+"is present "+count+" times");
		//}
	}
}

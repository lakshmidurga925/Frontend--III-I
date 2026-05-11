package Patterns;

import java.util.Scanner;

public class Revtrinum {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number of rows:");
		int n=Sc.nextInt();		
			for (int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			
			}
		Sc.close();
		


	}

}

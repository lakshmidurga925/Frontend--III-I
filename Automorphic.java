package swapna3;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner Sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		int temp=num*num;
		int a=num;
		while(num>0) {
			if(num%10!=temp%10) {
		System.out.println(a+ "  It is a not Automorphic");
			System.exit(a);
		}		
			num/=10;
			temp/=10;
		}	
		System.out.println(a+"  It is a Automorphic");
		Sc.close();
	}
}


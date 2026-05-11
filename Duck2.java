package swapna3;

import java.util.Scanner;

public class Duck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=Sc.nextInt();
		int temp=num;
		while(temp>0) {
				if(temp%10==0) {
					System.out.println("It is a duct number");
					return;
		}			
				temp=temp/10;
		}	
		
			System.out.println("It is a not duct number");
		
	}
}


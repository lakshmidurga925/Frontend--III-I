package swapna3;
import java.util.Scanner;
public class Harshednum {
	public static void main(String[]args){
	Scanner Sc=new Scanner (System.in);
	System.out.println("enter the number:");
	int num=Sc.nextInt();
	int temp=num,sum=0;
	while(num>0) {
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	if(temp%sum==0) {
		System.out.println("It is a harshed number");
	}
	else {
		System.out.println("It is not a harshed number");
	}
	Sc.close();
	}

}

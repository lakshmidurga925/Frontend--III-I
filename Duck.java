package swapna3;
import java.util.Scanner;
public class Duck {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=Sc.nextInt();		
		while(num>0) {
				if(num%10==0) {
					System.out.println("It is a duct number");
					System.exit(num);
		}			
				num=num/10;
		}	
		
			System.out.println("It is a not duct number");
		}
}

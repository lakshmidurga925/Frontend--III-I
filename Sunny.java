package swapna3;
import java.util.Scanner;
public class Sunny {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=Sc.nextInt();
		
			while(num!=1 && num!=4) {
				int sum=0;
					while(num>0) {
					int digit=num%10;
					sum=sum+(digit*digit);
					num=num/10;
					}
				num=sum;
			}
			if(num==1) {
				System.out.println("happ");
			}
			else {
				System.out.println("unhapp");
			}
		 }
}
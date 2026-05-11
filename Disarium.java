package swapna3;
import java.util.Scanner;
public class Disarium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner Sc=new Scanner(System.in);
				System.out.println("enter your number");
				int num=Sc.nextInt();
				int temp=num;
				int count=0;
				while(temp>0) {
					count++;
					temp=temp/10;
				}
				temp=num;
				int power=1;
				int sum=0;
				int digit=temp%10;
				for(int i=0;i<=digit;i++) {
					power=power*digit;
				}
				count--;
				
	}

}

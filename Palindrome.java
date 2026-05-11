package swapna2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		int rev=0;
		int count=num;
		while(num!=0){
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;			
		}
		System.out.println(rev);
		if(count==rev){
			System.out.println(" It is a palindrome");
		}	
		
		else {
			System.out.println("it is a not palindrome");
		}
		
		
		
		
		
		
		
		
		Sc.close();	
	}

}

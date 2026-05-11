package swapna2;
import java.util.Scanner;
public class Primeornot {
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int num=Sc.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) { 
				count++;
			}
		}
			
			if (count==2) {
				System.out.println(" It is a prime number");
			}
			
			else {
				System.out.println(" It is not a prime number");
			}
			Sc.close();
		}
		
	}


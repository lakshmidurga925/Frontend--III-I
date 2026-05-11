package Patterns;
import java.util.Scanner;
public class Symtriangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number of rows:");
		int n=Sc.nextInt();		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {				
				System.out.print("* ");
							}
			System.out.println();
		}
			for (int i=1;i<=4;i++) {
				for(int j=4;j>=i;j--) {	
					System.out.print("* ");
				}
			System.out.println();
		}
		Sc.close();		
		}
	}



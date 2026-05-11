package swapna2;
	import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println(" enter the number");
		int num=Sc.nextInt();
		int a=0,b=1 ;
		int c;
		for(int i=0;i<=num;i++) {
			System.out.println(a);
			 c=a+b;
			a=b;
			b=c;
		}
		
	}
}

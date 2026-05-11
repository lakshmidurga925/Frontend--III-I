package swapna2;
	import java.util.Scanner;
public class Reverse {

		public static void main (String[] args) {
			int num;
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter the number:");
			num=Sc.nextInt();
			int rev;
			while(num!=0) {
				rev=num%10;
				num=num/10;
				System.out.println(rev);
				}
			
		}
			
}

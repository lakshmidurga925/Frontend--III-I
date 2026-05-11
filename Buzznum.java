package swapna3;
	import java.util.Scanner;
public class Buzznum {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=Sc.nextInt();
		if(num%10==7||num/7==0) {
			System.out.println("Buzz number");
		}
		else {
			System.out.println("Not Buzz number");
		}
	}

}

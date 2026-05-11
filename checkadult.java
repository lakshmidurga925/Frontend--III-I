package swapna2;
	import java.util.Scanner;
	
public class checkadult {
	
	public static void main (String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("enter the age : ");
		int age=Sc.nextInt();
		if(age>=18) {
			System.out.println(" you are adult");
		}
		else {
			System.out.println(" you are not adult");
		}
	}
}
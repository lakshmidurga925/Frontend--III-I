package swapna2;
import java.util.Scanner;
public class checkgradewithswitch {
	public static void main (String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the grade: ");
		char week=Sc.next().charAt(0);
		
		switch(week) {
		case 'A':
			System.out.println(" Excellent!");
			break;
		case 'B':
			System.out.println(" Good!");
			break;
			default:
				System.out.println(" Not specified!");
		}
	}

}

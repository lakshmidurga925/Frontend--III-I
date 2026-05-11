package swapna2;
import java.util.Scanner;
public class checkgrade{
	public static void main (String[] args) {
	Scanner Sc=new Scanner (System.in);
	System.out.println(" enter the marks : ");
	int marks =Sc.nextInt();
		if (marks>=1 && marks<=25){
		System.out.println("Grade :F ");
	}
	else if(marks<=0 || marks>=100) 	{
		System.out.println(" Invalid input ");
	}
		else if ( marks>25 && marks<=44) {
		System.out.println(" Grade :E");
	}
	else if ( marks>45 && marks<=49) {
		System.out.println(" Grade :D");
	}
	else if ( marks>50 && marks<=59) {
		System.out.println(" Grade : C");
	}
	else if ( marks>60 && marks<=69) {
		System.out.println(" Grade :B");
	}
	else if ( marks>70 && marks<=80) {
		System.out.println(" Grade :A");
	}
	else if (marks>80 && marks<=100) {
		System.out.println(" Grade:S");
	}
//	else {
//		System.out.println("invalid text ");
//	}
	 
		/*else {
		System.out.println("Invalid number");
	}*/
		Sc.close();
	}
}
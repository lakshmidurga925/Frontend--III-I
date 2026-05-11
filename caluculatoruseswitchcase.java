package swapna1;
	import java.util.Scanner;
public class caluculatoruseswitchcase {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=Sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=Sc.nextInt();
		System.out.println("Choose an arthematic operator like (+,-,*,/,) :");
		char opr=Sc.next().charAt(0);
		switch(opr) {
		case '+':
			 int result1=num1+num2;
			System.out.println("Addition is :"+result1);
			break;
		case '-':
			 int result2 =num1-num2;
			System.out.println("Sub is :"+result2);
			break;
		case '*':
			 int result3 =num1*num2;
			System.out.println("Mult is :"+result3);
			break;
		case '/':
			
			if(num2!=0) {
				System.out.println("div is :"+(num1/num2));
			}else {			 
			System.out.println("not divisible by zero :");
			}
			break;
		default:		
			System.out.println("Invalid number");
			Sc.close();
			}
		}
	}

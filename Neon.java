package swapna3;
import java.util.Scanner;
public class Neon {
	
	public static void main(String args[]) {
	Scanner Sc= new Scanner (System.in);
	System.out.println("Enter the number:");
	int num=Sc.nextInt();
	int sum=0,power;	
	power=num*num;
	while(power>0) {
		int digit=power%10;
		sum=sum+digit;
		power=power/10;		
	}
	if(sum==num) {
		System.out.println(sum+"  It is a Neon");
	}
	else {
		System.out.println(sum+"  It is not a Neon");
	}
	Sc.close();
}
}

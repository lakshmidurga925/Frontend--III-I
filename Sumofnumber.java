package swapna2;
import java.util.Scanner;
public class Sumofnumber {
	public static void main (String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println(" Enter the number :");
	int num=Sc.nextInt();
	int sum=0;
	for(int i=0;i<=num;i++) {
		if(i%2==0) {		
		sum=sum+i;
	}
		}
	System.out.println(sum);
	}
	
}


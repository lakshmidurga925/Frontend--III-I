package swapna3;
	import java.util.Scanner;
public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=Sc.nextInt();
		int temp=num;
		while(temp>9) {
			int sum=0;		
		while(temp>0) {
			int digit=temp%10;			
			sum=sum+digit;
			temp=temp/10;
		}
		temp=sum;
		}
		if(temp==1){
		System.out.println("It is magic number");
		}
		else {
			System.out.println("It is not a magic number");
		}
		Sc.close();
	}

}

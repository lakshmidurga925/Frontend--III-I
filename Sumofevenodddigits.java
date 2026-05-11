package swapna3;
	import java.util.Scanner;
public class Sumofevenodddigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner Sc = new Scanner (System.in);
				System.out.println(" Enter the number:");
				int num=Sc.nextInt();
				int sumeven=0;
				int sumodd=0;
					while(num!=0) {
						int digit=num%10;
					if(digit%2==0) {
						sumeven+=digit;						
					}									
					else {	
						sumodd+=digit;
						}	
					num=num/10;								
					}
					System.out.println("sumeven"+sumeven);
					System.out.println("sumodd"+sumodd);
					Sc.close();
	}
} 
		



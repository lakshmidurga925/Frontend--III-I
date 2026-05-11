package Patterns;

public class Reversepat {

	public static void main(String[] args) {
		{
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		{
		char ch1='P';
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(ch1+" ");
				ch1++;
			}
			System.out.println();
	
		}
	}
}
	}
}

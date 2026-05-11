package swapna2;
	
public class Fibonace {
	public static void main (String[] args) {		
	int n=7;	
		int a=0,b=1,c=1;
		for( int i=0;i<=n;i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		
	}
	}
}


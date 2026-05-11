package Arrays.java;

public class pos_negnum {

	public static void main(String[] args) {
		int positive=0,neg=0;
		int[] arr= {2,-5,10,-3,7,-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				positive++;
					else 
				neg++;
		}
			System.out.println("Positive: "+positive);
			System.out.println("Negative: "+neg);		
	}
}

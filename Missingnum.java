package Arrays.java;

public class Missingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
			int[] arr= {1,2,4,5};
			int n=arr.length+1;
		for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
			 	}
		 int total=n*(n+1)/2;
		System.out.println("Missing Number: "+(total-sum));
		}
	
	}



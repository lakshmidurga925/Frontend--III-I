package Arrays.java;

public class Secondlargeele {

	public static void main(String[] args) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int [] arr= {19,20,12,13};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second&& arr[i] !=first) {
				second=arr[i];
			}
		}
		System.out.println("Second large = "+second);
	}

}

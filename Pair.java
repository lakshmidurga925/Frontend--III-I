package Arrays.java;

public class Pair {
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};		
		int target=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i+1;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+"+ "+arr[j]);
				}
				else {
					System.out.println(arr[i]);
				}
			}
			
		}
	}
}

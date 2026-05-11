package Arrays.java;

public class Greaternumcount {

	public static void main(String[] args) {
		
		int count=0;
		int key=5;
		int[] arr= {1,5,8,2,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>key)
			count++;			
		}
		System.out.println("count: "+count);
		

	}

}

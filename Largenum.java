package Arrays.java;

public class Largenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		int large=0;
			for(int i=0;i<arr.length;i++) {
				
			if(arr[i]>large) 
				large=arr[i];
			}
			System.out.println(large);
	}

}

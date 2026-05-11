package Arrays.java;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,4,2,5};
		int key=2;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				count++;
		}
		System.out.println("Frequency of 2 is : "+count);
	}
}

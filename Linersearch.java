package Arrays.java;

public class Linersearch {

	public static void main(String[] args) {
		int key=25;
		int[] arr= {5,15,25,35,45};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(" Element is found at index "+i);
				return;
			}
		}
				System.out.println(" Element is not found");
		
	}
}

package Arrays.java;

public class Larandsma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int large=0,small=19;
		int [] arr= {19,20,12,13};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
				}
		 else if (arr[i]<small) {
			small=arr[i];
			}
		}
		System.out.println("Large num: "+large);
		System.out.println("Small num: "+small);

	}

}

package Arrays.java;

public class Evencount1 {
	public static void mian(String[] args) {
		int count=0;
		int [] arr= {1,2,34,5,6,77,38};		
		for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					count++;
				}
				System.out.println(count);
		}
			System.out.println("Even"+count);
	}
	}



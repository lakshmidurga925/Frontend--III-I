package Arrays.java;

public class Difbtlargeandsmall {
	public static void main(String[] args) {
	int large=0;
	int small=9;
	int[] arr= {10,5,20,8};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>large) {
			large=arr[i];
			}
	 else if (arr[i]<small) {
		small=arr[i];
		}
	}
	 int res=large-small;		

	System.out.println(" Difference is : "+res);
		
	}

	}



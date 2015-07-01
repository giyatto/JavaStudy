package ch6;

public class Suffle {
	
	public static int[] suffle(int[] arr) {
		if(arr==null || arr.length==0)
			return arr;
		
		int temp;
		
		for(int i=0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1 - i];
			arr[arr.length-1-i]=temp;
		}
		
		return arr;
		
	}

}

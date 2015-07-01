package ch6;

public class SuffleTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("변경 전 : arr = ");
		for(int a:arr){
			System.out.println(a+",");
		}
		
		arr = Suffle.suffle(arr);

		System.out.println("변경 후 : arr = ");
		for(int a:arr){
			System.out.println(a+",");
		}
	}

}

package ch6;

public class Exercise6_20 {

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		System.out.println(Math.random());
		
	}

	private static int[] shuffle(int[] original) {
		int[] arr = original;
		for (int i = 0; i < original.length; i++) {
			int index1 = (int) (Math.random() * 1000 % original.length);
			int index2 = (int) (Math.random() * 1000 % original.length);
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		return arr;
	}
}

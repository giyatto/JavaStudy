package ch6;

public class Exercise6_24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
		
		String value1 = "10";
		System.out.println(value+"의 절대값:"+absString(value1)); 
		
	}

	private static int abs(int value) {
	    return value >= 0 ? value : -value;
    }
	
	private static String absString(String value) {
	    return '-'+value;
    }

}

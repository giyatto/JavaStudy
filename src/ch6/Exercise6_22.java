package ch6;

public class Exercise6_22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	private static Boolean isNumber(String str) {

		if(str==null || str.equals("")) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (s < '0' || s > '9') {
				return false;
			}
		}
		return true;
	}

}

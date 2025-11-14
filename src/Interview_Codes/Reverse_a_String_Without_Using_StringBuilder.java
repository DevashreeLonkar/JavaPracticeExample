package Interview_Codes;

import StringCodes.ReverseString;

public class Reverse_a_String_Without_Using_StringBuilder {

	public static void main(String[] args) {
		String string= "Spring Boot";
		System.out.println("Original string:" +string);
		reverseString(string);
	}

	private static void reverseString(String string) {
		int count= 0;
		String rev="";
		int strLength = string.length()-1;
		for(int i= strLength; i>=0; i--) {
			rev= rev + string.charAt(i);
		}
		System.out.println("Reverse string is: " +rev);
	}

}

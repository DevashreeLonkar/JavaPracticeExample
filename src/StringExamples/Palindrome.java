package StringExamples;

public class Palindrome {

	public static void main(String[] args) {
		String str= "madam";
		boolean result= isPalindrome(str);
		System.out.println(result);

	}

	private static boolean isPalindrome(String str) {
		String reversed= new StringBuilder(str).reverse().toString();
		return str.equalsIgnoreCase(reversed);
	}

}

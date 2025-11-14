package Interview_Codes;

public class String_is_Palindrome {

	public static void main(String[] args) {
		String s= "mamm";
		System.out.println("Original string: "+s);
		isStringPalindrome(s);
	}

	private static void isStringPalindrome(String s) {
		String reverse="";
		for(int i=s.length()-1; i>=0; i--) {
			reverse= reverse+ s.charAt(i);
		}
		
		if(s.equals(reverse)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
	}

}

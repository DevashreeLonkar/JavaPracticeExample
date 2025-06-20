package StringCodes;

public class ReverseString {

	public static void main(String[] args) {
		String str="Hello";
		String rev="";
		
		System.out.println("Before Reversing string is: " +str);
		for(int i= str.length() - 1; i>=0; i--) {
			rev= rev+ str.charAt(i);
		}
		System.out.println("After Reversing string is: " +rev);

	}

}

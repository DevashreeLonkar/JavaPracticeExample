package practicecodes;

public class Palindrome {

	public static void main(String[] args) {
		int num= 1231;
		int reverse=0;
		int original= num;
		
		while(num != 0) {
			int digit= num %10;
			reverse= reverse *10 + digit;
			num= num/10;
		}
		
		if(original == reverse) {
			System.out.println("Number is a Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}

	}

}

package practicecodes;

public class NumberOfDigits {

	public static void main(String[] args) {
		int num=-12345;
		int count= String.valueOf(Math.abs(num)).length();
		
		System.out.println("Number of digits: " +count);

	}

}

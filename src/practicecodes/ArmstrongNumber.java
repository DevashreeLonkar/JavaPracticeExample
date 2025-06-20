package practicecodes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number= 1534;
		int original= number;
		int result=0;
		
		int n = String.valueOf(number).length(); 
		
		while(number != 0) {
			int digit= number % 10;
			result= (int) (result + Math.pow(digit, n));
			number= number/10;
		}
		
		if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
	}

}

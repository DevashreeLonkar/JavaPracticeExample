package practicecodes;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a=5; int b=10;
		System.out.println("Before swapping numbers are: a= "+a+ ", b= "+b );
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After swapping numbers are: a= "+a+ ", b= "+b );
	}

}

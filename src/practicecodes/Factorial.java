package practicecodes;

public class Factorial {

	public static void main(String[] args) {
		int factorial=1;
		int num=5;
		
		for(int i=1; i<=num; i++) {
			factorial= factorial * i;
		}
		System.out.println("Factorial of " +num+ " is: " +factorial);

	}

}

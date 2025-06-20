package practicecodes;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10;
		int first=0; int second=1; int next;
		
		System.out.println("Fibonacci series is: ");
		
		for(int i=0; i<=num; i++) {
			System.out.print(first +" ");
			next= first + second;
			first=second;
			second=next;
		}

	}

}

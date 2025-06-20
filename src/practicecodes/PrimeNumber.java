package practicecodes;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=10;
		if(isPrime(n)) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) { 
            //try each number by using % 
              if (n % i == 0) { 
                return false; 
          } 
       }          
		return true; 
	}
}

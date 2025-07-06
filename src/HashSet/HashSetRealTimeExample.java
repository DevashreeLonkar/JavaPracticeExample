package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetRealTimeExample {

	public static void main(String[] args) {
		HashSet<String> registeredUserSet= new HashSet<>();
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter username to register (or type 'exit' to stop):");
			String username= scanner.nextLine();
			
			if(username.equalsIgnoreCase("exit")) {
				break;
			}
			
			if(registeredUserSet.add(username)) {
				System.out.println("Username registered successfully.");
			}
			else {
				System.out.println("Username already taken. Please choose another.");
			}
		}
		System.out.println("Registered usernames: " +registeredUserSet);
		scanner.close();
	}

}

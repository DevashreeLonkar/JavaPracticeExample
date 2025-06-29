package StreamCodes;

//48 Print the middle character of a given String

public class MiddleCharacter {

	public static void main(String[] args) {
		String s= "Education";
		
		if(s== null || s.isEmpty()) {
			System.out.println("String is empty");
		}
		
		int middleIndex= s.length()/2;
		
		char middle;
		
		if(s.length() % 2== 0) {
			middle= s.charAt(middleIndex - 1); 
		}
		else {
			middle= s.charAt(middleIndex);
		}
		
		System.out.println("Middle Character is: "  +middle);

	}

}

package StringCodes;

public class ReverseEachWordOfGivenString {

	public static void main(String[] args) {
		String str= "Hello World";
		String[] words= str.split(" ");
		StringBuilder result= new StringBuilder();
		
		for(String word: words) {
			StringBuilder reverseWord= new StringBuilder(word).reverse();
			result.append(reverseWord).append(" ");
		}
		System.out.println("Reversed each word: " + result.toString().trim());
	}

}

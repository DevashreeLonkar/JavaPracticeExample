package StreamCodes;

//11 Given a string, find the first non-repeated character

import java.util.Arrays;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input= "swiss";
		
		Character result= input.chars().mapToObj(c-> (char)c)
				.filter(ch->input.indexOf(ch) == input.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
		
		System.out.println(result);

	}

}

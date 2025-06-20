package StreamCodes;

//12 Given a string, find the first repeated character

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String input= "swiss";
		Set<Character> seen=new HashSet<>();
		
		Character result= input.chars().mapToObj(c->(char)c)
				.filter(ch->!seen.add(ch))
				.findFirst().orElse(null);
		
		System.out.println(result);

	}

}

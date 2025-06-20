package StreamCodes;

import java.util.Arrays;

//06 Given a sentence, find the words with a specified number of vowels
public class WordsWithTwoVowels {

	public static void main(String[] args) {
		String s= "I am learning Java stream API";
		
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==2)
		.forEach(System.out::println);

	}

}

package StreamCodes;

//04 Find the 2nd highest length word in the given sentence

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLongestWordLength {

	public static void main(String[] args) {
		String sentence = "Java Stream API is powerful and concise";
		
		Optional<Integer> s= Arrays.stream(sentence.split(" ")).map(String::length).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println(s);
	}

}

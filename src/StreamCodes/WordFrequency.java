package StreamCodes;

//05 Given a sentence, find the occurrence of each word

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		
	 String sentence = "Java Stream API is powerful and Java is fast";
	 
	Map<String, Long> ans= Arrays.stream(sentence.split(" "))
			.collect(Collectors.groupingBy(x->x,Collectors.counting()));

	 System.out.println(ans);
	}

}

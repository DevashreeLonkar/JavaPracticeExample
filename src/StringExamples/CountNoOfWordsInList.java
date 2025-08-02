package StringExamples;

import java.util.Arrays;
import java.util.List;

public class CountNoOfWordsInList {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
	            "Java is fun",
	            "I love coding",
	            "This is a test"
	        );

	        int totalWords = 0;

	        for (String sentence : sentences) {
	            String[] words = sentence.trim().split("\\s+");
	            totalWords += words.length;
	        }

	        System.out.println("Total number of words in all sentences: " + totalWords);
	}

}

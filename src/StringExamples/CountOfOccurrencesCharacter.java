package StringExamples;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccurrencesCharacter {

	public static void main(String[] args) {
		String str= "I Love Javva Programming";
		str= str.replaceAll("\\s", "");
		
		Map<Character, Integer> charCountMap= new HashMap<>();
		
		for(char ch :  str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()) {
			System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
		}
	}

}

package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		//String input= "Devashree";
		String input= "Count the frequency";
		input=input.replaceAll("\\s","").toLowerCase();
		
		Map<Character, Integer> map= new HashMap<>();
		
		for(char ch: input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

	}

}

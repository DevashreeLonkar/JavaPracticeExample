package Interview_Codes;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StringCompressionStream {

	public static void main(String[] args) {
		 String input = "aaabbc";
		 
		 String compressed= compressedString(input);	
		 System.out.println("Compressed: " + compressed);
	}

	private static String compressedString(String str) {
		
		StringBuffer sb= new StringBuffer();
		
		str.chars()
		.mapToObj(c-> (char) c)
		.collect(Collectors.groupingBy(c->c, LinkedHashMap:: new, Collectors.counting()))
		.forEach((ch, count) -> sb.append(ch).append(count));
		
		// Return original if compressed is not smaller
        String result = sb.toString();
        return result.length() < str.length() ? result : str;
        
	}

}

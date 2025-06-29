package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//57 Convert list of string into map of String and its equivalent length

public class StringLengthMap {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("Java", "Python", "Javascript");
		
	Map<String, Integer> ansMap= list.stream().collect(Collectors.toMap(s->s, s->s.length()));
		

	System.out.println(ansMap);
	}

}

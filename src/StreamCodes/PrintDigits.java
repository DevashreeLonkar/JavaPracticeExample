package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//29 Find and print strings containing only digits

public class PrintDigits {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("123", "a34fd", "cv34","44");
		
		List<String> answerList= list.stream().filter(x->x.matches("\\d+"))
		.collect(Collectors.toList());

		System.out.println(answerList);
	}

}

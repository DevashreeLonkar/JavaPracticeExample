package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfDomain {

	public static void main(String[] args) {
		
		String[] strings= {"abc@gmail.com", "xyz@yahoo.com", "fgh@hotmail.com", "fgh@gmail.com", "ghj@yahoo.com"};
		Map<Object, Long> occurence= Arrays.stream(strings)
				.map(x->x.substring(x.indexOf("@")))
				.collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
		System.out.println("Ocuurence of Domains: "+occurence);
	}

}

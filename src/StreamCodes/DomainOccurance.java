package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//33 Find the occurrence of domains using Java streams

public class DomainOccurance {

	public static void main(String[] args) {

		  List<String> emails = Arrays.asList(
	                "alice@gmail.com", "bob@yahoo.com", "carol@gmail.com",
	                "dave@hotmail.com", "eve@yahoo.com", "frank@gmail.com"
	        );
		  
		  Map<String, Long> domainCount= emails.stream().map(x->x.substring(x.indexOf("@")))
		 .collect(Collectors.groupingBy(x->x, Collectors.counting()));

		  System.out.println(domainCount);
	}

}

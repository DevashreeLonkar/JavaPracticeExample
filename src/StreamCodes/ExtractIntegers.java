package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14 Given a list of strings, create a list that contains only integers

public class ExtractIntegers {

	public static void main(String[] args) {
	String[] s= {"abc", "55", "xyz", "2012", "855", "-2"};

	List<String> list= Arrays.stream(s).filter(x->x.matches("-?\\d+"))
	.collect(Collectors.toList());
	
	System.out.println(list);
	}

}

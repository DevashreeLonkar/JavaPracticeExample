package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Print Strings that only has digits

public class PrintStringsWithDigits {

	public static void main(String[] args) {
		
		String strings[]= {"a2e", "aa1", "123", "098", "w23", "987"};
		
		List<String> answer= Arrays.stream(strings)
				.filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
		
		System.out.println("List that only has numbers: "+answer);
	}

}

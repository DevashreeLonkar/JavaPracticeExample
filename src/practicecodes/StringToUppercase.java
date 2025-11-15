package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUppercase {

	public static void main(String[] args) {
		String[] s= {"abc", "xyz", "tyu", "poi"};

		List<String> answer= Arrays.stream(s)
				.map(x->x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("After converting to Uppercase: "+answer);
	}

}

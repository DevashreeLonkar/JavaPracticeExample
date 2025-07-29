package StringExamples;

import java.util.Arrays;
import java.util.Collection;

public class ConvertStringToCollectionOfStrings {

	public static void main(String[] args) {
		String string = "apple,banana,orange,grape";
		
		Collection<String> collection=Arrays.asList(string.split(","));
		System.out.println(collection);

	}

}

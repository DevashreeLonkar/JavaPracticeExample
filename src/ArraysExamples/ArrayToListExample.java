package ArraysExamples;

import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {
		String[] array= {"Devashri", "Devashree", "Devu"};
		
		//Convert Array To List
		List<String> list = Arrays.asList(array);
		
		System.out.println("Converted list: " +list);
		System.out.println("Original array: " +Arrays.toString(array));

	}

}

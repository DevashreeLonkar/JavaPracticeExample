package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println("Before reverse: " +list);
		Collections.reverse(list);
		System.out.println("After reverse: " +list);

	}

}

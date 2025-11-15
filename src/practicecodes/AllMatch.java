package practicecodes;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {
		
		String[] s= {"ert", "efgh"};
		
		boolean output= Arrays.stream(s).allMatch(x->x.startsWith("e"));

		System.out.println(output);
	}

}

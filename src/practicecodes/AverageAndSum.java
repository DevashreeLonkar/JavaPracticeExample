package practicecodes;

import java.security.AllPermission;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.PrimitiveIterator.OfDouble;

public class AverageAndSum {

	public static void main(String[] args) {
		
		Integer[] i= {1,2,3,4,5};
		
		double sum= Arrays.stream(i)
				.mapToDouble(x->x).sum();
		System.out.println("Sum of all elements: "+sum);
		
		OptionalDouble average= Arrays.stream(i)
				.mapToInt(x->x).average();
		
		System.out.println("Average of all elements: "+average);

	}

}

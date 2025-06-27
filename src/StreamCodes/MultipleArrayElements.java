package StreamCodes;

//39 Multiply array elements(Conceptual)

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultipleArrayElements {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> answerIntegers= list.stream().reduce((a,b)->a*b);
		
		if(answerIntegers.isPresent()) {
			System.out.println(answerIntegers.get());
		}

	}

}

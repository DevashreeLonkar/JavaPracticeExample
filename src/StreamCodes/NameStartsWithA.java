package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//43 Print the names that start with A and count them

public class NameStartsWithA {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Apple", "Alia", "Banana", "Apricot", "Asia");
		
		Stream<String> ans=	list.stream().filter(x->x.startsWith("A"));
		Stream<String> ans1= list.stream().filter(x->x.startsWith("A"));
		
		ans.forEach(System.out::println);
				
		try {
			Long countLong= ans1.count();
			System.out.println(countLong);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

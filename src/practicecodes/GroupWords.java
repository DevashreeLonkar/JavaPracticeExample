package practicecodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group words based on middle character
public class GroupWords {

	public static void main(String[] args) {
	
		String[] str={"ere", "ini", "wre", "tnt", "sas", "pas", "tas"};

		Map<Object, List<String>> groupList= Arrays.stream(str)
				.collect(Collectors.groupingBy(x->x.toString().substring(1, 2)));
		
		System.out.println(groupList);
	}

}

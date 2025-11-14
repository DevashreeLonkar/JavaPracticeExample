package Interview_Codes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseLinkedListStream {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>(Arrays.asList(1,2,3,4));
		
		List<Integer> reversed= IntStream.range(0, list.size())
				.mapToObj(i -> list.get(list.size() - 1 -i))
				.collect(Collectors.toList());
		
		System.out.println(reversed);

	}

}

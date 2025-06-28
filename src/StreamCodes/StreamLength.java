package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLength {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("ema", "Amit", "sham","ram", "devu");

		List<Integer> ans=	list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(ans);
		
	Long ans1=	list.stream().collect(Collectors.counting());
	System.out.println(ans1);
	}

}

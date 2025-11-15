package practicecodes;

import java.util.stream.IntStream;

public class CountParticularSubstring {

	public static void main(String[] args) {
	
		String str = "whatisgoingonwhatforeyoudoing";
		String sub = "what";
		
		long count= IntStream.range(0, str.length())
				.filter(i-> str.startsWith(sub, i))
				.count();
		System.out.println(count);

	}

}

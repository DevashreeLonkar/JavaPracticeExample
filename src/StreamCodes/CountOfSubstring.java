package StreamCodes;

import java.util.stream.IntStream;

//52 Print the count of a particular substring

public class CountOfSubstring {

	public static void main(String[] args) {
		String s= "ByeByeBirdieBye";
		String checkString= "Bye";
		
	long ans=	IntStream.range(0, s.length()-2)
		.filter(x->s.substring(x, x+3).equals(checkString))
		.count();
		
		System.out.println(ans);
	}

}

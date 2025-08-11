package StringExamples;

public class ReverseStringUsingBuiltInMethod {

	public static void main(String[] args) {
		String s= "Devashree";
		System.out.println("Original string : "+s);
		
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println("String after reverse: " +sb);

	}

}

package StringExamples;

public class ReverseStringUsingManualMethod {

	public static void main(String[] args) {
		String s= "sorry";
		System.out.println("Original string: "+s);
		
		stringReversed(s);

	}

	private static void stringReversed(String s) {
		String revString= "";
		
		for(int i= s.length()-1; i>=0; i--) {
			revString= revString + s.charAt(i);
		}
		System.out.println("Manual reverse string: " +revString);
		
	}

}

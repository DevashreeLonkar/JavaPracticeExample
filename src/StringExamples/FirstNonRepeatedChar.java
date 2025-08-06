package StringExamples;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
	 String str= "Devashree";
	 char result= findFirstNonRepeatedChar(str);
	 System.out.println(result);

	}

	private static char findFirstNonRepeatedChar(String str) {
		
		for(int i=0; i<str.length(); i++) {
			char currentChar= str.charAt(i);
			if(str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
				return currentChar;
			}
		}
		return 0;
	}

}

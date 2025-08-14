package StringExamples;

public class StringConcatExample {

	public static void main(String[] args) {
		String a= "Dev";
		String b= "ash";
		String c= "ree";
		
		String operator= usingPlusOperator(a,b,c);
		System.out.println(operator);
		
		String concat= usingConcatOperator(a, b, c);
		System.out.println(concat);
		
		String stringBuilder= usingStringBuilder(a,b,c);
		System.out.println(stringBuilder);
		
		String join= usingJoinOperator(a,b,c);
		System.out.println(join);

	}

	private static String usingJoinOperator(String a, String b, String c) {
		return String.join("", a,b,c);
	}

	private static String usingStringBuilder(String a, String b, String c) {
		StringBuilder sb= new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		return sb.toString();
	}

	private static String usingConcatOperator(String a, String b, String c) {
		return a.concat(b).concat(c);
	}

	private static String usingPlusOperator(String a, String b, String c) {
		return a+b+c;
	}

}

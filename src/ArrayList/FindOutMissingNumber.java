package ArrayList;

import java.util.ArrayList;

public class FindOutMissingNumber {

	public static void main(String[] args) {
		addinArray(1,100);
	}

	private static void addinArray(int startElement, int endElement) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		int actualSum= 0;
		for(int i=startElement; i<= endElement; i++) {
			if(i != 40) {
				list.add(i);
				actualSum+= i;
			}
		}
		System.out.println("List: " +list);
		
		int expectedSum= (endElement * (endElement+1)) / 2;
		int missingNumber= expectedSum - actualSum;
		
		System.out.println("Missing Number: " +missingNumber);
	}
}

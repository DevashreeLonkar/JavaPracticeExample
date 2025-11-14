package Interview_Codes;

import ArrayList.FindOutMissingNumber;

public class Missing_Number_in_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5};

		int n=5;
		int expectedSum= n*(n+1)/2;
		
		int actualSum= 0;
		for(int num: arr) {
			actualSum+= num;
		}
		 int missingNumber= expectedSum - actualSum;
		
		 System.out.println("Missing number is: " +missingNumber);

	}
	}

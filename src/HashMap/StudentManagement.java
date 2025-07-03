package HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

	public static void main(String[] args) {
		 // Creating a HashMap to store student ID and Student object
		HashMap<Integer, Student> studentDetails= new HashMap<>();
		
		//Adding student details
		studentDetails.put(101, new Student(1, "Max", "BE-Comp", 25));
		studentDetails.put(102, new Student(2, "George", "BE-Mech", 24));
		studentDetails.put(103, new Student(3, "Maxine", "BE-Civil", 26));
		studentDetails.put(104, new Student(4, "Jinny", "BE-Civil", 23));
		
		 // 2. Retrieving student details
		System.out.println(studentDetails.get(101));
		
		// 3. Checking if a student exists
//		if(studentDetails.containsKey(102)) {
//			System.out.println("Key 102 is present");
//		}
//		
//		else {
//			System.out.println("Key 102 is not present");
//		}
		
		int searchID= 103;
		if(studentDetails.containsKey(searchID)) {
			System.out.println("Student with " +searchID+ " found: " +studentDetails.get(searchID));
		}
		else {
			System.out.println("Student ID with "+searchID+ " not found");
		}
		
		// 4. Updating student course
		if(studentDetails.containsKey(102)) {
			studentDetails.get(102).setCourse("BE-Mechanical");
			System.out.println("Updated student 102 :" +studentDetails.get(102));
		}
		
		 // 5. Removing a student
		studentDetails.remove(104);
		//System.out.println("After Removing student 104: " +studentDetails);
		
		 // 6. Displaying all students
		for(Map.Entry<Integer, Student> entry: studentDetails.entrySet()){
			System.out.println("Key " +entry.getKey()+ " Value " +entry.getValue());
		}
		
		 // 7. Checking if the HashMap is empty
		System.out.println("Is Hashmap empty: "+studentDetails.isEmpty());
		
		 // 8. Clearing all students
		studentDetails.clear();
		System.out.println("After clearing data, the size is: " +studentDetails.size());
	}

}

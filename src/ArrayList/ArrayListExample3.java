package ArrayList;

import java.util.ArrayList;

class Emplyoee{
	int empId;
	String empName;
	public Emplyoee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emplyoee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}

class Student{
	int rollno;
	String stuName;
	public Student(int rollno, String stuName) {
		super();
		this.rollno = rollno;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stuName=" + stuName + "]";
	}
}

public class ArrayListExample3 {

	public static void main(String[] args) {
		Emplyoee e1=new Emplyoee(1, "Devashree");
		Student s1= new Student(11, "ABC");
		
		ArrayList<Object> a1= new ArrayList<>();
		a1.add(e1);
		a1.add(s1);
		
		System.out.println("ArrayList using toString Method");
		for(Object a: a1) {
			System.out.println("ArrayList is: " +a);
		}
		
		System.out.println("ArrayList using access Method");
		for(Object obj: a1) {
			if(obj instanceof Emplyoee) {
				Emplyoee ee= (Emplyoee) obj;
				System.out.println("Emplyoee ID: " +ee.empId+ " , Emplyoee Name: " +ee.empName);
			}
			else if(obj instanceof Student) {
				Student ss= (Student) obj;
				System.out.println("Student rollno: " +ss.rollno+ ", Student name: " +ss.stuName);
			}
		}
		
	}

}

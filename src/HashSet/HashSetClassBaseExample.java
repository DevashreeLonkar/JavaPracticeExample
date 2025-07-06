package HashSet;

import java.util.HashSet;
import java.util.Objects;
public class HashSetClassBaseExample {

	public static void main(String[] args) {
		 HashSet<ClgStudent> students = new HashSet<>();

	        // Adding students to HashSet
	        students.add(new ClgStudent(1, "Alice", 20));
	        students.add(new ClgStudent(2, "Bob", 22));
	        students.add(new ClgStudent(3, "Charlie", 21));
	        students.add(new ClgStudent(1, "Alice", 20)); // Duplicate based on 'id', won't be added
	        
	       // Displaying students in HashSet
	        for(ClgStudent s: students) {
	        	System.out.println(s);
	        }
	}

	static class ClgStudent{
		private int id;
		private String name;
		private int age;
		public ClgStudent(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "ClgStudent [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		
		  // Overriding equals() to compare objects based on id
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        ClgStudent student = (ClgStudent) obj;
	        return id == student.id;  // Assuming id uniquely identifies a student
	    }
	}
}

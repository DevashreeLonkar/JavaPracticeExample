package StreamCodes;

//51 Return comparison of a Person object based on first name and then last name

public class Personss {
		public Personss(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
		@Override
	public String toString() {
		return "Personss [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
		public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		String firstName;
		String lastName;

	

}

package StreamCodes;

//58 Transform one object into another . Transform Employee to EmployeeDTO

public class EmpDTO {
		int id;
	    String name;
	
	    EmpDTO(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "EmployeeDTO{id=" + id + ", name='" + name + "'}";
	    }

}

package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ClinicAppointmentSystem {

	public static void main(String[] args) {
		// Create a HashMap to store Doctor ID and Name
		HashMap<Integer, String> docDetails= new HashMap<>();
		
		//Adding data
		docDetails.put(101, "Dr. Smith - Cardiologist");
		docDetails.put(102, "Dr. Johnson - Neurologist");
	    docDetails.put(103, "Dr. Brown - Dermatologist");
	    docDetails.put(104, "Dr. Alex - MD");

	    for(Entry<Integer, String> entry: docDetails.entrySet()) {
	    	System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
	    }
	    
	    // Display available doctors
	    docDetails.forEach((id, name)-> System.out.println("Name " +name+ " ID " +id));
	    
	    // 3. Checking if a doctor is available
	    int searchID= 103;
	    if(docDetails.containsKey(searchID)) {
	    	System.out.println("Doctor ID with " +searchID+ " is available " +docDetails.get(searchID));
	    }else {
			System.out.println("Doctor ID with " +searchID+ " is not available ");
		}
	    
	    // 4. Updating doctor details
	    docDetails.replace(102, "Dr. John - Neurologist");
	    System.out.println("Doctor 102 is updated: " +docDetails.get(102));
	    
	    // 5. Removing a doctor from the system
	    docDetails.remove(104);
	    
	    // 6. Booking an appointment
	    HashMap<Integer, String> appointmentDetails=  new HashMap<>();
	    appointmentDetails.put(1001, "Patient: Alice, Doctor: Dr. John - Neurologist");
	    appointmentDetails.put(1002, "Patient: Bob, Doctor: Dr. Brown - Senior Dermatologist");

	    // 7. Displaying all appointments
	    System.out.println("All Appointments");
	    appointmentDetails.forEach((id, details)->System.out.println("ID "+id+ " Details " +details));
	    
	    // 8. Checking if a specific appointment exists
	    int searchAppointmentID= 1001;
	    if(appointmentDetails.containsKey(searchAppointmentID)) {
	    	System.out.println("Appointment with " +searchAppointmentID+ " exists");
	    }
	    else {
			System.out.println("Appointment with " +searchAppointmentID+ " does not exists");
		}
	    
	    // 9. Cancelling an appointment
	    appointmentDetails.remove(1002);
	    System.out.println("Updated details after cancelling appointments");
	    appointmentDetails.forEach((id, details)-> System.out.println("ID " +id+ " Details " +details));
	    
	    // 10. Clearing all appointments at the end of the day
	    appointmentDetails.clear();
	    System.out.println("Appointment details after clearing: " +appointmentDetails.size());
	}

}

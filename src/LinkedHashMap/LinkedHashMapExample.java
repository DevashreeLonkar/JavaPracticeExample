package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;

//No duplicate
//maintain insertion order
//only one null key is allowed or multiple null value
//non-synchronized
//cursor is not applicable so need to retrive data using object.keySet().iterator()

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> name= new LinkedHashMap<>();
		name.put(1,"Ravi"); 
		name.put(3,"avinash"); 
		name.put(2,"Ravikant"); 
		name.put(4,"virat");
		name.put(4,"vir");
		name.put(null,"Rohit");
		
		//Get element
		System.out.println("Names: " +name.get(4));
		
		Iterator<Integer> itrIterator= name.keySet().iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}

	}

}

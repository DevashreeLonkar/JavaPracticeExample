package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String[] city= {"Pune", "Mumbai","Banglore","Hyderabad"};
		
		//Convert Array to ArrayList
	List<String> cities= Arrays.asList(city);
	System.out.println(cities);
	
	//Convert ArrayList to Array
	ArrayList<String> cityList= new ArrayList<>();
	cityList.add("Kerala");
	cityList.add("Punjab");
	 
	String cityArray[]= new String[cityList.size()];
	cityArray= cityList.toArray(cityArray);
	
	for(String arr: cityArray) {
		System.out.println(arr);
	}

	}

}

package TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCustomOrder {

	public static void main(String[] args) {
		
		TreeSet<String> city = new TreeSet<>(Comparator.reverseOrder());
		city.add("Pune");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Delhi");
		city.add("delhi");
		city.add("Bangalore");
		
		Iterator<String> itr = city.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}

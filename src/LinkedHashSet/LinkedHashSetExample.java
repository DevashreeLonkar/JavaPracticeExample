package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

//No duplicate allowed
//Maintain Insertion Order
//allowed Only one null value
//Non Synchronize
//Slower as compare to Hashset
//Only Iterator is applicable for LinkedHashSet but in below i have to use for-each because for-each internally use iterator

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(15);
		linkedHashSet.add(3);
		linkedHashSet.add(6);
		linkedHashSet.add(85);
		
		for(Integer itr: linkedHashSet) {
			System.out.println(itr);
		}
		
		Iterator<Integer> itr1= linkedHashSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}

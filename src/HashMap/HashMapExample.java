package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//No maintained insertion order
//Allowed to one null key
//not thread safe / not synchronized
//Performance is faster
//does not allowed duplicate key but allowed to duplicate value
//Default capacity is 16 and load factor is 0.75

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1,"Java");
		map.put(2,"Python");
		map.put(3,"React");
		map.put(4,"Ruby");
		map.put(null,"C++");
		map.put(5,"Angular");
		map.put(6,"Struds");
		map.put(7,"Struds");
		//map.put(null,"CPP"); (Overwrites previous value and prints new value)
		
		System.out.println(map);

		Set<Entry<Integer, String>> itr= map.entrySet();
		for(Entry<Integer, String> entry :itr) {
			System.out.println("Key: " +entry.getKey()+ " Value: " +entry.getValue());
		}
		
		Iterator<Integer> keysetIterator= map.keySet().iterator();
		for(Entry<Integer, String> entry:itr) {
			System.out.println(entry);
		}
	}

}

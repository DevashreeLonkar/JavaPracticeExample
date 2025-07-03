package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparisson {

	public static void main(String[] args) {
		
		 // Creating 3 HashMaps
		HashMap<Integer, String> map1= new HashMap<>();
		HashMap<Integer, String> map2= new HashMap<>();
		HashMap<Integer, String> map3= new HashMap<>();
		
		 // Adding values
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Cherry");

        map3.put(1, "Green Apple");
        map3.put(2, "Banana");
        map2.put(3, "Cherry");
        
        // Comparing using equals()
        System.out.println("Are map1 and map2 equal?: "+map1.equals(map2));
        System.out.println("Are map1 and map3 equal?: "+map1.equals(map3));
        
        // Comparing using Key
        System.out.println("Are map1 and map2 equal keyset?: "+map1.keySet().equals(map2.keySet()));
        System.out.println("Are map1 and map3 equal keyset?: "+map1.keySet().equals(map3.keySet()));
        
        // Comparing using value
        HashSet<String> map1Set= new HashSet<>(map1.values());
        HashSet<String> map2Set= new HashSet<>(map2.values());
        HashSet<String> map3Set= new HashSet<>(map3.values());
        
        System.out.println("Are map1 and map3 equal values?: " +map1Set.equals(map3Set));
        System.out.println("Are map1 and map2 equal values?: " +map1Set.equals(map2Set));
	}

}

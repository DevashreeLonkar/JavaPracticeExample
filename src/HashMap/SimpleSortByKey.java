package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleSortByKey {
	 public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<>();
	        map.put("Banana", 20);
	        map.put("Apple", 10);
	        map.put("Orange", 30);
	        map.put("Grapes", 40);

	        Map<String, Integer> sortedMap = map.entrySet()
	            .stream()
	            .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
	            .collect(Collectors.toMap(
	            		e->e.getKey(), 
	            		e->e.getValue()
	            	));

	        System.out.println(sortedMap);
	        for (String key : sortedMap.keySet()) {
	            System.out.println(key + " -> " + sortedMap.get(key));
	        }
	    }
}

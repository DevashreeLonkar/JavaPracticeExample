package ArrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(50);
		
/*		System.out.println(list.get(1));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer intList : list) {
			System.out.println("Int List by forEach: " +intList);
		}	
		System.out.println(list.contains(1));
	
		list.remove(2);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		list.add(2, 60);
		for (Integer integers : list) {
			System.out.println(integers);
		}
		*/
		
		list.set(2, 100); // replaces that index value
		System.out.println(list);
	}
}

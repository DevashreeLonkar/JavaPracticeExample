package TreeSet;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet<>();
		
	  //tree.add(null);// null is not allowed
		tree.add(12);
		tree.add(1);
		tree.add(15);
		tree.add(15);//Not allowed to duplicate element
		
		System.out.println(tree);//Ascending order is maintained
		System.out.println(tree.descendingSet());//descending order

//		for (Object obj : tree) {
//			System.out.println(obj);
//		}

	}

}

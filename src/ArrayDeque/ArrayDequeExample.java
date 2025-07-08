package ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
	ArrayDeque<Integer> deq = new ArrayDeque<>();
		
		deq.add(40);
		deq.offer(20);
		deq.add(82);
		deq.add(82);
		deq.add(52);
//		deq.add(null);
		
		System.out.println(deq);

	}

}

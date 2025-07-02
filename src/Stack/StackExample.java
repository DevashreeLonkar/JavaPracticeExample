package Stack;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.text.Position;

public class StackExample {

	public static void main(String[] args) {
		
		//Adding elements to stack
		Stack<Integer> stack= new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		//Print stack
		System.out.println("Full Stack is: " +stack);
		
		// 2. Peeking at the top element
		System.out.println("Peek from top: " +stack.peek());
		
		 // 3. Popping an element (removes top)
		System.out.println("Popping an element (removes top): " +stack.pop());
		System.out.println("After Pop Stack is: " +stack);
		
		// 4. Searching for an element
	    int position= stack.search(40);
		if(position!= -1) {
			System.out.println("Position from top: " +position);
		}
		else {
			System.out.println("Element not found");
		}
		
		 // 5. Checking if stack is empty
		System.out.println("Is Stack empty? " +stack.isEmpty());
		
		// 6. Getting the size of the stack
		System.out.println("Stack size: " +stack.size());
		
		// 7. Iterating through the stack
		for(int stackList: stack) {
			System.out.println(+stackList);
		}
	}

}

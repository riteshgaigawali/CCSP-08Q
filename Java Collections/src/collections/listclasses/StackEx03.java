// The pop() method is responsible for extracting and removing the top-most element from the stack.
package collections.listclasses;

import java.util.Stack;

public class StackEx03 {

	public static void main(String[] args) {
System.out.println("Start @Cyber Success");
		
		Stack s = new Stack();
		s.push(100);
		s.push(200.5f);
		s.push('X');
		s.push(true);
		s.push("Cyber");
		System.out.println(s);
		
		System.out.println(s.pop());// extracts and remove the top-most element from the stack
		
		System.out.println(s);
		
		
		System.out.println("Stop @Cyber Success");

	}

}

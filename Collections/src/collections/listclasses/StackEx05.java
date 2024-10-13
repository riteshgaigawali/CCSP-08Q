/*
  	#1. boolean java.util.Vector.isEmpty() :
  		The isEmpty() method will return the boolean based on whether the stack is empty or not.
  	
  	#2. int java.util.Stack.search(Object o) :
  		The search() method returns the distance of the object from the top of the stack; which will be at a 1-based position from the top of the stack.
  		
  	
*/
package collections.listclasses;

import java.util.Stack;

public class StackEx05 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		Stack s = new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.search(200));
		System.out.println(s.search(400));
		
		System.out.println("Stop @Cyber Success");

	}

}

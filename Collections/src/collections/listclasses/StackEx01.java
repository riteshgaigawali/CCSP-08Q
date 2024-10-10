/*
 	#3. Stack(C) v1.0 :
   
   	- Stack were introduced in v1.0.
   	- It store both homogeneous and heterogeneous type of data.
   	- It allows duplicate objects.
   	- Null insertion is possible in Stack.
   	- Insertion order is maintained in Stack.
   	- Methods of Stack are synchronized.
   	- Data structure is based on Fisrt-In-Last-Out(LIFO) dynamic in nature.
   	- Enumeration, Iterator, and ListIterator Cursors are applicable.
   	
 - The push(Object o) method is responsible to add the elements on to the top of stack.
   	
*/
package collections.listclasses;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		Stack s = new Stack();
		s.push(100);
		s.push(200.5f);
		s.push('X');
		s.push(true);
		s.push("Cyber");
		System.out.println(s);
		s.push(null);
		s.push("Cyber");
		System.out.println(s);
		
		
		System.out.println("Stop @Cyber Success");

	}

}

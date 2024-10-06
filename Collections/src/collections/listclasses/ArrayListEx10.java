/*
 - If we can make Collection homogeneous then the same thing can be archived with Arrays then, Why not we go for Arrays rather than Collections ?
 >> Arrays still holds the limitations that :
  			1) It's size is static and does not change during the runtime.
  			2) Arrays consumes complete memory whether you store or do not store any data.
  			3) Arrays do not support the concept of methods, hence the operations become very complex.
  
  - Important methods supported by Collection :
  
  		#1. boolean java.util.AbstractCollection.containsAll(Collection c) :
  		
  		The containsAll method is responsible to check if one Collection is present in another Collection or not.
  		
  
*/ 

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx10 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		ArrayList al1 = new ArrayList();

		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1);

		// Approach - 1
		ArrayList al2 = new ArrayList(al1);// ArrayList(Collection c)
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println(al2);
		
		System.out.println(al2.containsAll(al1));// true
		
		Integer i = 200;
		al2.remove(i);
		
		System.out.println(al2.containsAll(al1));// false

		System.out.println("Stop @Cyber Success");

	}

}

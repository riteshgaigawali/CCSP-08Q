/*
 - When we already have the for-each loops and get method then, What is the need for Cursors ?
 >> - The for-each loops and get are only meant to extract data from the collection, but they cannot perform any manipulations on collection.
    - Whereas Cursors not only can extract data but they can also perform manipulations like add, set, and remove.
    - Hence in real-time we prefer to use Cursors.
    
   What are the different types of Cursors ?
   >> There are mainly three types of Cursors :
      		
      		1) Enumeration Cursor(I) v1.0
      		2) Iterator Cursor(I) v1.2
      		3) ListIterator Cursor(I) v1.2
      		
    #1. Enumeration Cursor(I) v1.0 :
    
    	- Enumeration Cursor is applicable to only legacy Collection(i.e Vector and Stack).
    	- For the Enumeration Cursor to extract the data from the Vector collection it has to have the address of all the elements and this is only possible with the help of elements() method.
    	- Once the Cursor points to the collection there are two steps to be followed :
    			1) Check if the element is present or not. - hasMoreElments() 
    			2) Extract element from the collection. - nextElement()
    	- Enumeration Cursor is not an universal cursor as it is applicable only to legacy collections(i.e Vector and Stack).
    	- Enumeration Cursor will only perform read operation.
    	- This Cursor will only read in the forward direction, hence it is called as Unidirectional Cursor. 
    
*/

package collections.listclasses;

import java.util.Enumeration;
import java.util.Vector;


public class EnumerationEx {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
				//Vector Collection
				Vector v = new Vector();
				v.add(100);
				v.add(200);
				v.add(300);
				v.add(400);
				v.add(500);
				System.out.println(v);
				
				// Enumeration Cursor
				Enumeration e = v.elements();
				
				while(e.hasMoreElements()) {
					Integer i = (Integer)e.nextElement();
					System.out.println(i);
				}
			
				System.out.println("Stop @Cyber Success");

	}

}

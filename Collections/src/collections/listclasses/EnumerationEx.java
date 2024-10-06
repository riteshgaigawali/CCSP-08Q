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
    	- Once the Cursor points to the collection there are two steps to be followed 
    
*/

package collections.listclasses;

public class EnumerationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

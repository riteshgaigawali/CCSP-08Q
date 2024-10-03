/*
 Limitations of an Array :
 
 	- Arrays do not support the concept of predefined methods, hence the operations will become complex.
 	- Arrays will still consume memory whether you store values or do not store values.
 	- Arrays are fixed in size and cannot increase/decrease during the runtime.
 	- Hence to overcome this Limitations of an Array we go for Collections.
 	
 Collections :
 
 	- Collections can be defined as a set of classes and interfaces which are meant to store and manipulate the data.
 	- All collection classes are part of java.util package.
 	- Collection in a simple way are nothing but an extension of an Array.
 	- Collections are categorize mainly into three types :
 		1) Lists Collections
 		2) Sets Collections
 		3) Maps Collections
 	
 	1. Lists Collections :
 		
 						Collection(I) v1.2
 						       | [extends]
 						     List(I) v1.2
 						       | [implements]
 		-----------------------------------------------
        |                      |                      |
  ArrayList(C) v1.2      LinkedList(C) v1.2       Vector(C) v1.2
                                                      |
                                                   Stack(C) v1.2
                                                   
 - In Collections we can store not only one particular type of data but we can also store multiple type of data(homogeneous & heterogeneous).
 - If this is possible in one type of Collection(i.e ArrayList) then, What is the need of having multiple Collection classes ?
 >> In every Collection we do store the homogeneous as well as heterogeneous data, but the Characteristics of the each Collection regards to data storage will not remain the same.
 
 - What are the total characteristics applicable to all Collections ?
 >> Characteristics applicable to all Collections :
 		1) Based on Version.
 		2) Based on Homogeneous/Heterogeneous data.
 		3) Based on Duplicate Objects
 		4) Based on Null Insertions.
 		5) Based on Insertion Order.
 		6) Based on Synchronized and Unsynchronized. 
 		7) Based on Data Structure.
 		8) Based on Cursor.
 		
   #1. ArrayList :
   
   	- ArrayLists were introduced in v1.2.
   	- It store both homogeneous and heterogeneous type of data.
   	- It allows duplicate objects.
   	- Null insertion is possible in ArrayList.
   	- Insertion order is maintained in ArrayList.
   	- Methods of ArrayList are unsynchronized.
   	- Data structure is dynamic in nature, i.e the size of ArrayList is dynamic.
   	
 
*/

package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx01 {
	
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		
		ArrayList al = new ArrayList();
		
		al.add(100); //--> Autoboxing
		al.add(200);
		System.out.println(al);
		
		al.add("Cyber"); //--> heterogeneous data
		al.add('X');
		System.out.println(al);
		
		al.add(null); //--> null insertion
		al.add(100);
		al.add('X'); //--> duplicate values
		System.out.println(al);
		
		
		
		System.out.println("Stop @Cyber Success");
	}

}

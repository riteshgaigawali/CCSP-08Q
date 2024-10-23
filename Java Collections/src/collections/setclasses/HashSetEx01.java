/*
 		2. Set Collection :
 		
 						Collection(I) v1.2
 						       | [extends]
 						     List(I) v1.2
 						       | [implements]
 		-----------------------------------------------
        |                      	                      |
  HashSet(C) v1.2     					       SortedSet(I) v1.2
        |                                             |
 LinkedHashSet(C) v1.4                         NavigableSet(I) v1.6
 													  |					
												TreeSet(C) v1.2			
 		
 - A few unique characteristics mentioned below are different from the List collection :
 
 	1) Insertion order is not maintained by all the Set classes.
 	2) Duplicates are not allowed in all Set classes. It will not give an error but will override the existing Object with the recently added Object.
 	3) All Set classes does not store the both homogeneous and heterogeneous data.
  
  #1. HashSet(C) v1.2 :
  	
  	- HashSet were introduced in v1.2.
   	- It store both homogeneous and heterogeneous type of data.
   	- It does not allows duplicate objects.
   	- Null insertion is possible in HashSet.
   	- Insertion order is not maintained in HashSet.
   	- Methods of HashSet are synchronized.
   	- Data structure is dynamic in nature.
   	- Only Iterator Cursors are applicable.
   
   - Default Capacity and Load Factor :- 
   
   	The default capacity of HashSet is 16.
   
   	What is Load Factor ?
   	>> A load factor is a measure of how full the collection is allowed to get before it's capacity is automatically increased.
   	   Load factor can also be called as Fill Ratio.
   	   The default load factor is 0.75(i.e 75%).
   	   The load factor ranges between 0.0 to 1.0(i.e 0% to 100%).
   
   - We can use following constructors to set the capacity and load factor :
   
  public java.util.HashSet(); --> default capacity is 16 and load factor is 0.75(i.e 75%).
  public java.util.HashSet(java.util.Collection<? extends E>); --> default capacity is 16 and load factor is 0.75(i.e 75%).
  public java.util.HashSet(int, float); --> user defined capacity, load factor can be passed.
  public java.util.HashSet(int); --> user defined capacity can be set and load factor will be default as 0.75(i.e 75%).
  
   	
*/
package collections.setclasses;

import java.util.HashSet;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(200.5f);
		hs.add('X');
		System.out.println(hs);
		hs.add(100);
		hs.add("Cyber");
		hs.add(null);
		System.out.println(hs);
		
		
		System.out.println("Stop @Cyber Success");
	}

}

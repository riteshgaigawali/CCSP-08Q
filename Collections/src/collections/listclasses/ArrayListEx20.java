/*
  - To convert Collection to Array we can use toArray() method.
  
  		ArrayList --> public <T> T[] toArray(T[]);
*/
package collections.listclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx20 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		System.out.println(al);
		
		// converting from ArrayList to Array
		Integer[] arr = al.toArray(new Integer[al.size()]);
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Stop @Cyber Success");


	}

}

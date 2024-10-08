/*
  - How do we convert Array to ArrayList and ArrayList to Array ?
  >> To convert Array to ArrayList we can use static method asList() of Arrays class;
  	 asList() method returns the List type collection and we can store it inside the reference of List interface.
*/

package collections.listclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx19 {

	public static void main(String[] args) {

		System.out.println("Start @Cyber Success");
	
		String[] arr = {"Cyber", "Success", "Training", "Institute", "Pune"};
		
		//asList() converts Array to List
		List<String> li = Arrays.asList(arr);
		
		// ArrayList(Collection c)
		ArrayList<String> al = new ArrayList<String>(li); 
		System.out.println(al);
		
		for(String s : al) {
			System.out.println(s);
		}
		
		
		
		System.out.println("Stop @Cyber Success");

	}

}
// java.util.Arrays --> public static <T> java.util.List<T> asList(T...);
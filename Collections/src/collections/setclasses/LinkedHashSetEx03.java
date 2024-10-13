// Only Iterator cursor is applicable to the LinkedHashSet class and other Set classes.
package collections.setclasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx03 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Cyber");
		lhs.add("Success");
		lhs.add("Training");
		lhs.add("Institute");
		lhs.add("Pune");
		System.out.println(lhs);
		
		
		Iterator<String> i = lhs.iterator();
		
		while(i.hasNext()) {
			 System.out.println(i.next());
		}
		
		
		System.out.println("Stop @Cyber Success");

	}

}

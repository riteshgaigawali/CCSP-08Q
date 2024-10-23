// Insertion order is not maintained in TreeSet.
package collections.setclasses;

import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeSet ts = new TreeSet();
		ts.add("Cyber");
		ts.add("Success");
		ts.add("Training");
		ts.add("Institute");
		ts.add("Pune");
		System.out.println(ts);
		
		System.out.println("Stop @Cyber Success");

	}

}

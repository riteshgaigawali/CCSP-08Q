// Only Iterator cursor is applicable. public TreeSet(Comparator<? super E> comparator)
// Whenever comparison happens this comparison will take place by internally calling compareTo() method.
// TODO Revise this topic - it is very important.
package collections.setclasses;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx05 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");

		TreeSet<Flipkart> ts1 = new TreeSet<>(new FlipkartProdId());

		ts1.add(new Flipkart(101, "Table"));
		ts1.add(new Flipkart(102, "Chair"));
		ts1.add(new Flipkart(103, "Laptop"));
		ts1.add(new Flipkart(104, "Monitor"));
		System.out.println(ts1);

		Iterator<Flipkart> i1 = ts1.iterator();

		while (i1.hasNext()) {
			Flipkart f = i1.next();
			System.out.println(f.prodId + " - " + f.prodName);
		}
		
		System.out.println("----------------------------------------------------------------------");

		TreeSet<Flipkart> ts2 = new TreeSet<>(new FlipkartProdName());

		ts2.add(new Flipkart(101, "Table"));
		ts2.add(new Flipkart(102, "Chair"));
		ts2.add(new Flipkart(103, "Laptop"));
		ts2.add(new Flipkart(104, "Monitor"));
		System.out.println(ts2);

		Iterator<Flipkart> i2 = ts2.iterator();

		while (i2.hasNext()) {
			Flipkart f = i2.next();
			System.out.println(f.prodId + " - " + f.prodName);
		}

		System.out.println("Stop @Cyber Success");

	}

}

// Only Iterator cursor is applicable to the HashSet class and other Set classes.
package collections.setclasses;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx03 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashSet<RedBus> hs = new HashSet<>();
		hs.add(new RedBus(104,"Mumbai CSMT"));
		hs.add(new RedBus(101,"Pune Junction"));
		hs.add(new RedBus(103,"Amravati"));
		hs.add(new RedBus(102,"Shegaon"));
		System.out.println(hs);
		
		Iterator<RedBus> i = hs.iterator();
		
		while(i.hasNext()) {
			RedBus rb = i.next();
			System.out.println(rb.ticketId+" - "+rb.ticketLoc);
		}
		
		System.out.println("Stop @Cyber Success");
	}

}

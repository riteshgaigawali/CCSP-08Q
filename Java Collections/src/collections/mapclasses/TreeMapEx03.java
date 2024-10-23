package collections.mapclasses;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx03 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		TreeMap tm = new TreeMap(new EmpName());
		tm.put(new Employee(105,"Hitesh"), 700000);
		tm.put(new Employee(185,"Vedant"), 900000);
		tm.put(new Employee(100,"Hardik"), 950000);
		tm.put(new Employee(115,"Prajwal"), 1000000);
		System.out.println(tm);
		
		Set s = tm.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry<Employee, Integer> me = (Map.Entry)i.next();
			
			Employee e = me.getKey();
			System.out.print(e.empId+" - "+e.empName+" : ");
			
			System.out.println(me.getValue());
		}
		
		System.out.println("Stop @Cyber Success");

	}

}

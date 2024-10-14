package collections.mapclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx05 {

	public static void main(String[] args) {
		System.out.println("Start @Cyber Success");
		
		HashMap<Student, Skill> hm = new HashMap<>();
		hm.put(new Student(101, "Ritesh"), new Skill(1,"Java"));
		hm.put(new Student(102, "Harshal"), new Skill(2,"Selenium"));
		hm.put(new Student(103, "Sumit"), new Skill(3,"Python"));
		System.out.println(hm);
		
		Set s = hm.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry<Student, Skill> e = (Map.Entry)i.next();
			
			Student stu = (Student)e.getKey();
			System.out.print(stu.studId+" - "+stu.studName+" : ");
			
			Skill sk = (Skill)e.getValue();
			System.out.println(sk.skillId+" - "+sk.skillName);
		}
		
		System.out.println("Stop @Cyber Success");

	}

}

package collections.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx25 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		ArrayList<Amazon> al = new ArrayList<Amazon>();
		al.add(new Amazon(104,"Book"));
		al.add(new Amazon(102,"NoteBook"));
		al.add(new Amazon(105,"Pen"));
		al.add(new Amazon(101,"Pencil"));
		al.add(new Amazon(103,"Eraser"));
		System.out.println(al);
		
		System.out.println("Before sorting :- ");
		for(Amazon a : al) {
			System.out.println(a.prodId+" - "+a.prodName);
		}
		
		Collections.sort(al);
		
		System.out.println("After sorting :- ");
		for(Amazon a : al) {
			System.out.println(a.prodId+" - "+a.prodName);
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}

}

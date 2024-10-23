package collections.listclasses;

import java.util.ArrayList;

public class ArrayListEx08 {

	public static void main(String[] args) {
		
		System.out.println("Start @Cyber Success");
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(true);
		al.add("Cyber");
		al.add('X');
		System.out.println(al);
		
		al.add(1, 500.5f);// add(index, object) --> add element at given index and if there is already value at given index it increment it's index by 1
		System.out.println(al);
		
		System.out.println(al.contains(200));//true
		System.out.println(al.contains("Cyber"));//true
		
		System.out.println(al.isEmpty());// returns true if ArrayList is empty or returns false
		
		al.clear();// clear all the element of ArrayList
		System.out.println(al.isEmpty());// true
		
		//al.remove(3); java.lang.IndexOutOfBoundsException
		
		System.out.println("Stop @Cyber Success");
	}
}

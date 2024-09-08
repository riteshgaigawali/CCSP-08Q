/*
- In a single Java program minimum we can have single abstract class or we can have multiple abstract classes.
- A normal class can inherite from an abstract class as well as an abstract class can inherite from an another abstract class.
*/

abstract class GrandParent{
	abstract void m1();
	abstract void m2();
}
abstract class Parent extends GrandParent{
	
	void m1(){
		
		System.out.println("Inside m1 method. - Parent");
	}
	
}
class Child extends Parent{
	
	void m2(){
		
		System.out.println("Inside m2 method. - Child");
	}
}
class AbstractionEx07{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		//Inheritance
		Child c = new Child();
		c.m1(); c.m2();
		System.out.println(" -------------------------------");
		//Polymorphism
		GrandParent gp = new Child();
		gp.m1(); gp.m2();
		
		System.out.println("Stop @Cyber Successs");
	}
}
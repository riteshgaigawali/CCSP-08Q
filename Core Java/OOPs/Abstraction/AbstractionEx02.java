/*
- Whenever we create abstract method those methods has to have implementation within Child class and this is possible with the concept of Overriding.
- We cannot create an Object of abstract class, because there is no implementation of the methods in abstract class, so it doesn't make any sense to create an object of abstract class.
*/

abstract class Parent{
	
	abstract void m1();
}
class Child extends Parent{
	
	@Override
	void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class AbstractionEx02{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		Child c = new Child();
		c.m1();
		System.out.println("Stop @Cyber Success");
	}
}
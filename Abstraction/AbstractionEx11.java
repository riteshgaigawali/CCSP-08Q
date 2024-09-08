/*
- We can execute the constructor within an abstract class by creating an object of the Child class.
- With the help of super statement in the Child class constructor we can call the constructor of Parent class which is abstract by nature. 
*/
abstract class Parent{
	
Parent(){
	
	System.out.println("Inside a constructor. - Parent");
}
}
class Child extends Parent{
	
	Child(){
		super();
		System.out.println("Inside a constructor. - Child");
	}
}
class AbstractionEx11{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		new Child();
		
		System.out.println("Stop @Cyber Success");
	}
}
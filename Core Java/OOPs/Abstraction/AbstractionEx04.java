/*
- In abstract classes we may not be able to create an object, but it will still have the capability to hold the address of the child.
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
class AbstractionEx04{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		//The address of Child is stored inside the abstract class Parent's type reference variable.
		Parent p = new Child();
		p.m1();
		System.out.println("Stop @Cyber Success");
	}
}
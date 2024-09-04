/*
- In abstract class not only we can create incomplete methods(eg. abstract methods) but also can create complete methods.
*/
abstract class Parent{
	
	abstract void m1();
	void m2(){
		
		System.out.println("Inside m2 method. - Parent");
	}
}
class Child extends Parent{
	
	void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class AbstractionEx05{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Parent p = new Child();
		p.m1();
		p.m2();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
Rule 7. B: It is possible to override if the Child and the Parent method access level is in the increasing order.
*/

class Parent{
	
	protected void m1(){
		
		System.out.println("Inside m1 method. - Parent");
	}
}
class Child extends Parent{
	
	public void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class PolymorphismEx30{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		//Upcasting
		Parent p = new Child();
		p.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
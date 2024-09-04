/*
Rule 7. C: It is not possible to override if the Child and the Parent method access level is in the decreasing order.
*/

class Parent{
	
	//error: m1() in Child cannot override m1() in Parent
	public void m1(){
		
		System.out.println("Inside m1 method. - Parent");
	}
}
class Child extends Parent{
	
	protected void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class PolymorphismEx31{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		//Upcasting
		Parent p = new Child();
		p.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
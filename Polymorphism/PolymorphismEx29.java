/*
Rule 7.A : It is possible to override if the parent method access level and the child method access level are both same.
(eg. Parent-public & Child-public || Parent-protected & Child-protected)
*/

class Parent{
	
	protected void m1(){
		
		System.out.println("Inside m1 method. - Parent");
	}
}
class Child extends Parent{
	
	protected void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class PolymorphismEx29{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		//Upcasting
		Parent p = new Child();
		p.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
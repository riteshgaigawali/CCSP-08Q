/*
Rule 6 : If a member is made private it is not possible to override, because the private members are accesible within only the same class they are defined.
*/

class Parent {
	
	private void m1(){
		
		System.out.println("Inside m1 method. - Parent");
	}
}
class Child extends Parent{
	
	void m1(){
		
		System.out.println("Inside m1 method. - Child");
	}
}
class PolymorphismEx28{
	public static void main(String args[]){
	
	System.out.println("Start @Cyber Success");
	
	//Upcasting
	Parent p = new Child();
	p.m1(); //error: m1() has private access in Parent
	
	System.out.println("Stop @Cyber Success");
}
}
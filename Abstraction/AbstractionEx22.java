/*
- Java also allows to create an interface within a class.
- [Note :- Interfaces are not part of inheritance.]
*/
class Demo{
	
	interface Interface1{
		void m1();
	}
}
class AbstractionEx22 implements Demo.Interface1{
	public void m1(){
		System.out.println("Inside m1 method. - AbstractionEx22");
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		AbstractionEx22 ref = new AbstractionEx22();
		ref.m1();
		
		System.out.println(" ---------------------------------------------");
		
		Demo.Interface1 ref1 = new AbstractionEx22();
		ref1.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
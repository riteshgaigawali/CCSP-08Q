/*
- The static methods within an interface cannot be called with the class-name which implements that interface.
*/
interface Interface1{
	static void m1(){
		System.out.println("Inside m1 method. - Interface1");
	}
}
class AbstractionEx30 implements Interface1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Call to method using interface-name
		Interface1.m1();
		
		//Call to method using class-name
		AbstractionEx30.m1(); //  error: cannot find symbol
		
		System.out.println("Stop @Cyber Success");
	}
}
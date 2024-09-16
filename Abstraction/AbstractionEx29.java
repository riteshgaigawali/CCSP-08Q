/*
- We can also create complete methods within an interface by making the method as static.
- Since the definition is complete and the method is static, therefore these methods cannot be overridden or changed in the implementation class.
*/
interface Interface1{
	static void m1(){
		System.out.println("Inside m1 method. - Interface1");
	}
}
class AbstractionEx29 implements Interface1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Call to method using interface-name
		Interface1.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
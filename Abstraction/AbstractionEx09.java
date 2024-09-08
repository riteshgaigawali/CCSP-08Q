/*
Abstract and Static is an illegal combination because abstract methods have to be implemented but it is not possible to override static methods.
*/
abstract class Parent{
	
	abstract static void m1();//error: illegal combination of modifiers: abstract and static
}
class AbstractionEx09{
	
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		System.out.println("Stop @Cyber Success");
	}
}
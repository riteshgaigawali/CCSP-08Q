/*
- It is mandatory to implement all the methods in a class that implements an interface until and unless that class is declared as an abstract class.
- Why create interfaces ?
--> - Interfaces by nature are more abstract than abstract classes.
- At time, customers may not have detailed requirement at start but aware of services to be implemented in future.
- Hence to define them we use interfaces.


error: AbstractionEx17 is not abstract and does not override abstract method test2() in Interface01
class AbstractionEx17 implements Interface01{
^
1 error

*/
interface Interface01{
	
	void test1();
	void test2();
}
class AbstractionEx17 implements Interface01{
	
	public void test1(){
		
		System.out.println("Inside test1 method. - AbstractionEx17");
	}
	/*	
	public void test2(){
		
		System.out.println("Inside test2 method. - AbstractionEx17");
	} 
	*/
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Interface01 i = new AbstractionEx17();
		i.test1();
		i.test2();
		
		System.out.println("Stop @Cyber Success");
	}
}
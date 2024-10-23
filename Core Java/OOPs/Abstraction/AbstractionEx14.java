/*
Static blocks are also allowed within abstract classes.
*/
abstract class Parent{
	static{
		System.out.println("Inside a static block. - Parent");
	}
}
class Child extends Parent{
	
	
}
class AbstractionEx14{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		new Child();
		
		System.out.println("Stop @Cyber Success");
	}
}
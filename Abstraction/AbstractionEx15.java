/*
- Within normal classes we can create variables, complete methods, constructors, static & non-static blocks and also can create object of normal class.
- Within abstract classes we can create variables, complete as well as incomplete methods, static & non-static blocks, but we cannot create object of an abstract class.
*/
abstract class Parent{
	
	int a =100;
}
class Child extends Parent{
	
	float b = 200.5f;
}
class AbstractionEx15{
	
	public static void main(String args[]){
	System.out.println("Start @Cyber Success");

	Child c = new Child();
	System.out.println(c.a + c.b);
	
	System.out.println("Stop @Cyber Success");	
	}
}
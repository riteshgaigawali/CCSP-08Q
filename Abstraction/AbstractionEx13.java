/*
We are able to create non-static blocks within the abstract class.
*/
abstract class Parent{
	{
		System.out.println("Inside a non-static block. - Parent");//1
	}
	Parent(){
		System.out.println("Inside 0 args constructor. - Parent");//2
	}
}
class Child extends Parent{
	
	
}
class AbstractionEx13{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		new Child();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
Assingment question.
*/
abstract class Parent{
	
	Parent(){
	System.out.println("Inside 0 args constructor. - Parent");//1
	}
	Parent(int a){ 
	this();
	System.out.println("Inside 1 args constructor. - Parent "+a);//2
	}
}
class Child extends Parent{
	
	Child(){ 
	this(20.5f);
	System.out.println("Inside 0 args constructor. - Child");//4
	}
	Child(float b){
	super(10);
	System.out.println("Inside 1 args constructor. - Child "+b);//3
	}
}
class AbstractionEx12{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		new Child();
		
		System.out.println("Stop @Cyber Success");
	}
}
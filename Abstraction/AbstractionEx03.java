/*
- If the Parent abstract method comes into Child, in the Child there are two situations :
'situation 1' :- If the Child class does not override the abstract method then the Child class will become the abstract class.
'situation 2' :- If the Child class override the abstract method then the Child class becomes the normal class.
 
*/
abstract class Parent{
	
	abstract void m1();
}

/*class Child extends Parent{   }error: Child is not abstract and does not override abstract method m1() in Parent.*/

abstract class Child extends Parent{   }

class AbstractionEx03{
	
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- We can create variables within an interface.
- A variable within an interface is public, static and final.
*/
interface Interface1{
	int a = 100;
}
class AbstractionEx24 implements Interface1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		System.out.println(a);
		a=200; //error: cannot assign a value to final variable a
		System.out.println(a);
		
		AbstractionEx24 ref = new AbstractionEx24();
		ref.m1();
		
		System.out.println("Stop @Cyber Success");
	}
	
	void m1(){
		System.out.println("Inside m1 method. - AbstractionEx24");
		System.out.println(a);
	}
}

/*

>> javap Interface1
Compiled from "AbstractionEx24.java"
interface Interface1 {
  public static final int a;
}

*/
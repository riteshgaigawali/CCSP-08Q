/*
 - Whenever we create any method within an interface it is always public and abstract by nature.
 - We can't create an object of an interface.
 - We can't create an object of an interface, but an interface can hold the address of the object of a class.
 */
 interface Interface01{
	 void m1(); // public and abstract
 }
 class AbstractionEx16 implements Interface01{
	 
	 public void m1(){
		 System.out.println("Inside m1 method. - AbstractionEx16");
	 }
	 
	 public static void main(String args[]){
		 System.out.println("Start @Cyber Success");
		 
		 //Interface01 i = new Interface01(); error: Interface01 is abstract; cannot be instantiated
		 
		 AbstractionEx16 ref = new AbstractionEx16();
		 ref.m1();
		 
		 Interface01 i = new AbstractionEx16();
		 i.m1();
		 
		 System.out.println("Stop @Cyber Success");
	 }
 }
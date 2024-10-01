/*
- In a Normal Inner Class we can access both static and non-static members, whereas in a Static Inner Class we can access only static members of the Outer class directly.
*/

//Outer Class
class Outer{
	
	int a = 100;
	static float b = 200.5f;
	
	//Static Inner Class
	static class Inner{
		static void m1(){
			System.out.println("Inside m1 method.");
			System.out.println(new Outer().a + b);
		}
	}
}

//controller class
class InnerClassEx20{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer.Inner.m1(); 
		
		System.out.println("Stop @Cyber Success");
	}
}
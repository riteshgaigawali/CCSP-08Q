/*
- To access non-static members of the Outer class within the static Inner class we need to create an Object of Outer class; as we cannot access non-static members into a static area.
	
*/

//Outer Class
class Outer{
	
	int a = 100;
	static float b = 200.5f;
	
	//Static Inner Class
	static class Inner{
		void m1(){
			System.out.println("Inside m1 method.");
			Outer o = new Outer();
			System.out.println(o.a + b);
		}
	}
}

//controller class
class InnerClassEx18{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer.Inner i = new Outer.Inner();
		i.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- In a static Inner class we can access Outer class static members directly, but cannot use non-static members of Outer class directly within Inner class.

*/
class Outer{
	
	int a = 100;
	static float b = 200.5f;
	
		static class Inner{
		void m1(){
		System.out.println("Inside m1 method.");	
		//System.out.println(a); error: non-static variable a cannot be referenced from a static context
		System.out.println(b);
		}
	}
		
}

//controller class
class InnerClassEx17{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer.Inner i = new Outer.Inner();
		i.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
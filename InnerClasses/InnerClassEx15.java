/*
- The static members of Outer class can be accessed directly inside Inner class.

*/
class Outer{
	
	int a = 100;
	static float b = 200.5f;
	
		class Inner{
		void m1(){
		System.out.println("Inside m1 method.");	
		System.out.println(a + b);
		}
	}
		
}

//controller class
class InnerClassEx15{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		new Outer().new Inner().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
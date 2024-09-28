/*
- But the Inner class members cannot directly be accessed within the Outer class.

*/
class Outer{
	int a = 100;
	
	class Inner{
		float f = 200.5f;
	}
	
	void m1(){
			System.out.println(a + f); //error: cannot find symbol
		}
}

//controller class
class InnerClassEx04{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer o = new Outer();
		o.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
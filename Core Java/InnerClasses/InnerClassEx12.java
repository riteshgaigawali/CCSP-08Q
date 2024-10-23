/*
- Private access modifier cannot be used for Single class or Outer class, but we can use it with Inner class.
*/
class Outer{
    int a = 100; 
	
	void test(){
		System.out.println("Inside test method.");
		Inner i = new Inner();
		i.m1();
	}
	
	private class Inner{
		
		float b = 200.5f;
		
		void m1(){
			System.out.println("Inside m1 method.");
			System.out.println(a + b);
		}
	}
	
}

//controller class
class InnerClassEx12{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> test();
		new Outer().test();
		
		System.out.println("Stop @Cyber Success");
	}
}
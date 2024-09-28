/*
- Example to demonstrate Non-static Normal Inner classes.
*/
class Outer{
	int a = 100; float b = 200.5f;
	
	void test(){
		System.out.println("Inside test method.");
		Inner i = new Inner();
		System.out.println(i.x + i.y);
	}
	
	class Inner{
		int x = 400; float y = 300.5f;
		
		void m1(){
			System.out.println("Inside m1 method.");
			System.out.println(a + b);
			test();
		}
	}
	
}

//controller class
class InnerClassEx06{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
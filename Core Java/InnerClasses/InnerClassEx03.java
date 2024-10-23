/*
	2) Non-static Inner classes :
		2.1 Normal Inner classes
		
- In the Normal Inner classes the Outer class members can directly be accessed within the Inner class.
	
*/
class Outer{
	int a = 100;
	class Inner{
		float f = 200.5f;
		void m1(){
			System.out.println(a + f);
		}
	}
}

//controller class
class InnerClassEx03{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
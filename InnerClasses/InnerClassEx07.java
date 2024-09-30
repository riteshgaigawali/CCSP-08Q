/*
- Private members of the Outer class can be accessed anywhere within the Inner class.
*/
class Outer{
	private int a = 100; 
	private float b = 200.5f;
	
	class Inner{
		
		void m1(){
			System.out.println("Inside m1 method.");
			System.out.println(a + b);
		}
	}
	
}

//controller class
class InnerClassEx07{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Inner class private members cannot be directly used within the Outer class.
- Private members of the Outer class can be accessed anywhere within the Inner class.
*/
class Outer{
		
	class Inner{
	
	private int a = 100; 
	private float b = 200.5f;
	
	}
	
	void m1(){
			System.out.println("Inside m1 method.");
			Inner i = new Inner();
			System.out.println(i.a + i.b);
		}
	
}

//controller class
class InnerClassEx08{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> m1()
		new Outer().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
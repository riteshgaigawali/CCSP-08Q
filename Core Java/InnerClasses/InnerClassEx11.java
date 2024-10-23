/*
- If an Inner class does not extend the Outer class we cannot use super keyword inside Inner class.
- But if an Inner class extends the Outer class we can use super keyword inside Inner class.
*/
class Outer{
	
	int a = 1000; 
	float b = 2000.5f;
		
	class Inner extends Outer {
		
	int a = 100; 
	float b = 200.5f;
	
	void m1(int a, float b){
			System.out.println("Inside m1 method.");
			
			System.out.println(a + b);
			System.out.println(this.a + this.b);
			System.out.println(super.a + super.b);
			
		}
	
	}
	
}

//controller class
class InnerClassEx11{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1(10, 20.5f);
		
		System.out.println("Stop @Cyber Success");
	}
}

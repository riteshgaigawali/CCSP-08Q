/*
- Using this keyword with the concept of Inner classes.
*/
class Outer{
	
	int a = 1000; 
	float b = 2000.5f;
		
	class Inner{
		
	int a = 100; 
	float b = 200.5f;
	
	void m1(int a, float b){
			System.out.println("Inside m1 method.");
			
			System.out.println(a + b);
			System.out.println(this.a + this.b);
			System.out.println(Outer.this.a + Outer.this.b);
			
		}
	
	}
	
}

//controller class
class InnerClassEx10{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1(10, 20.5f);
		
		System.out.println("Stop @Cyber Success");
	}
}

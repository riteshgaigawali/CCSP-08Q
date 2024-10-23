/*
- We can create parameterized methods like Outer classes within the Inner classes.
- We can use the concept of pass-by-value within the Inner class.
*/
class Outer{
	
	int a = 1000; 
	float b = 2000.5f;
		
	class Inner{
		
	int x = 100; 
	float y = 200.5f;
	
	void m1(int p, float q){
			System.out.println("Inside m1 method.");
			
			System.out.println(a + b);
			System.out.println(x + y);
			System.out.println(p + q);
			
		}
	
	}
	
}

//controller class
class InnerClassEx09{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> innerObject --> m1()
		new Outer().new Inner().m1(10, 20.5f);
		
		System.out.println("Stop @Cyber Success");
	}
}

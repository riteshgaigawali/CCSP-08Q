/*

- To access the Inner class members in Outer class we need to create the object of Inner class.	

*/
class Outer{
	int a = 100;
	
	class Inner{
		float f = 200.5f;
	}
	
	void m1(){
			
			Inner i = new Inner();
			System.out.println(a + i.f);
		}
}

//controller class
class InnerClassEx05{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer o = new Outer();
		o.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
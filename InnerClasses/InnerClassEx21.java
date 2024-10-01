/*
- Plot for Anonymous Inner Classes.
*/
class Parent{
	void m1(){ }
	void m2(){ }
}
class Child extends Parent{
	
	void m1(){
		System.out.println("Inside m1 method. - Child");
	}
	
	void m2(){
		System.out.println("Inside m2 method. - Child");
	}
	
}
class InnerClassEx21{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Child c = new Child();
		c.m1(); c.m2();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
2) Non-static Inner classes :
		2.3 Anonymous Inner classes
		
- A class without a name is called as Anonymous classes.
- In Anonymous classes we do not give the name to the class but compiler internally will give the name.

*/

//Normal class
class Parent{
	void m1(){ }
	void m2(){ }
}
//controller class
class InnerClassEx22{
	
	//Anonymous class
	Parent p = new Parent(){
		
		void m1(){System.out.println("Inside m1 method. - Anonymous class"); }
		void m2(){System.out.println("Inside m2 method. - Anonymous class");}
	
	};
	
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		InnerClassEx22 ref = new InnerClassEx22();
		ref.p.m1();
		ref.p.m2();
		
		System.out.println("Stop @Cyber Success");
	}
}
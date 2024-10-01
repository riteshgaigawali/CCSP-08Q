/*
- We can create Anonymous class not only with normal classes but also from the abstract classes.
*/

//Abstract class
abstract class Parent{
	abstract void m1();
	abstract void m2();
}
//controller class
class InnerClassEx23{
	
	//Anonymous class
	Parent p = new Parent(){
		
		void m1(){System.out.println("Inside m1 method. - Anonymous class"); }
		void m2(){System.out.println("Inside m2 method. - Anonymous class");}
	
	};
	
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		InnerClassEx23 ref = new InnerClassEx23();
		ref.p.m1();
		ref.p.m2();
		
		System.out.println("Stop @Cyber Success");
	}
}
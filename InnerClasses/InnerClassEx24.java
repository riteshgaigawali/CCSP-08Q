/*
- We can create Anonymous class not only with normal classes but also from the abstract classes as well as interfaces.
*/

//Interface
interface Parent{
	void m1();
	void m2();
}
//controller class
class InnerClassEx24{
	
	//Anonymous class
	Parent p = new Parent(){
		
		public void m1(){System.out.println("Inside m1 method. - Anonymous class"); }
		public void m2(){System.out.println("Inside m2 method. - Anonymous class");}
	
	};
	
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		InnerClassEx24 ref = new InnerClassEx24();
		ref.p.m1();
		ref.p.m2();
		
		System.out.println("Stop @Cyber Success");
	}
}
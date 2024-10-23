/*
- Java allows an interface to be created within an another interface.
*/
interface Interface1{
	
	interface Interface2{
		void m1();
	}
}
class AbstractionEx21 implements Interface1.Interface2{
	
	public void m1(){
		System.out.println("Inside m1 method. - AbstractionEx21");
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		AbstractionEx21 ref = new AbstractionEx21();
		ref.m1();
		
		System.out.println(" ---------------------------------------------");
		
		Interface1.Interface2 ref1 = new AbstractionEx21();
		ref1.m1();
		
		System.out.println("Stop @Cyber Success");
	}

}
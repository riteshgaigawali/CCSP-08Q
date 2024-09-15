/*
Assignment question.
*/
interface Interface1{
	default void m1(){
		System.out.println("Inside m1 method. - Interface1");
	}
	default void m2(){
		System.out.println("Inside m2 method. - Interface1");
	}
}
class AbstractionEx28 implements Interface1{
	
	public void m2(){
		System.out.println("Inside m2 method. - AbstractionEx27");
	}
	
	public void m3(){
		System.out.println("Inside m3 method. - AbstractionEx27");
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		AbstractionEx28 ref1 = new AbstractionEx28();
		ref1.m1(); ref1.m2(); ref1.m3();
		
		System.out.println(" --------------------------------------------");
		
		Interface1 ref2 = new AbstractionEx28();
		ref2.m1(); ref2.m2(); //ref2.m3(); error: cannot find symbol
		
		System.out.println("Stop @Cyber Success");
	}
}
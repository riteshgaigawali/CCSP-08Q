/*
- If the class-names of Inner classes are same then Java will add an extra value to the '.class' file-name to identify the .class files uniquely.

			Ex: Outer$1Inner.class
				Outer$2Inner.class
*/
class Outer{
 
	void test1(){
		System.out.println("Inside test1 method. - Outer");
		class Inner{ void m1(){ System.out.println("Inside m1 method. - Inner-1"); } }		
		Inner i = new Inner();
		i.m1();
	}
	void test2(){
		System.out.println("Inside test2 method. - Outer");
		class Inner{ void m1(){ System.out.println("Inside m1 method. - Inner-2"); } }		
		Inner i = new Inner();
		i.m1();
	}
		
}

//controller class
class InnerClassEx14{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Outer o = new Outer();
		o.test1(); o.test2();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
2) Non-static Inner classes :

- An example of non-static inner class.

*/
class Outer{
	int a = 100;
	class Inner{
		float f = 200.5f;
	}
}

//controller class
class InnerClassEx02{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//outer class object
		Outer o = new Outer();
		System.out.println(o.a);
		//System.out.println(o.f); error: cannot find symbol
		
		//inner class object
		Outer.Inner i = o.new Inner();
		System.out.println(i.f);
		
		System.out.println("Stop @Cyber Success");
	}
}
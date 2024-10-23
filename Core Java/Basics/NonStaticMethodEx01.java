/*
- If a method is not prefixed with the keyword static then automaticaly the method becomes non-static. 
- To access a non-static method inside same class as well as multiple class environment we need to create an object of the class.

 */
class NonStaticMethodEx01 {
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		NonStaticMethodEx01 nm = new NonStaticMethodEx01();
		nm.m1();
		System.out.println("Stop @Cyber Success");
	}

	void m1() {
		System.out.println("Inside m1 method....");
	}
}
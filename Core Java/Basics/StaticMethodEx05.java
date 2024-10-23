/*
 - If we want to access static methods from one class to another class we can access them using the class-name of class where it resides.

 */
class Demo {
	static void test() {
		System.out.println("Inside Demo.test ");
	}
}

class StaticMethodEx05 {

	public static void main(String args[]) {
		System.out.println("Start....");
		Demo.test();
		System.out.println("End....");

	}
}
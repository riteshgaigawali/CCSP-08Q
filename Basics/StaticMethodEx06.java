/*
 - Local variables redefined :  Variables which are declared within a method or part of the method as well as declared or part of constructor, or any block are called as local variables.
 Q. How do we access a local variable from one method to another method ?
 --> - With the help of pass-by-value shown in following program.
 */
class StaticMethodEx06 {
	public static void main(String args[]) {

		System.out.println("Start @Cyber Success");
		int a = 100; // local variable
		method6(a); // pass by value
		System.out.println("Stop @Cyber Success");
	}

	static void method6(int x)// here x is local variable
	{
		System.out.println("Inside method6...");
		System.out.println(x);
	}

}
/*
 - How do you access static members of another class ?
 --> There are two ways to access static members of another class by using class-name or creating an object of that class.
 - The static variables are the class-level variables, the value of a static variable is same for each and every object of class created.
 */
class Demo {
	static char x = 'a';
	static int a;
}

class StaticVarEx05 {
	public static void main(String args[]) {

		// System.out.println(x); error: cannot find symbol

		// Access by using class-name
		System.out.println(Demo.x);

		// Access by object creation
		Demo d = new Demo();
		d.a = 100;
		System.out.println(d.a); // warning : The static field Demo.x should be accessed in a static way.

		Demo d1 = new Demo();
		System.out.println(d1.a);// The same value assinged by object 'd' is same for the 'd1' object.
	}
}

/*
 - Variables that are declared ouside the method, constructor, or blocks but inside the class and are prfixed with the keyword 'static' are called as static variables.
 - How do you access static variables ?
 --> We can access static variables directly, we can access them ussing class-name, or we can create an object to access them.
 */
class StaticVarEx01 {

	static int a = 100;

	public static void main(String args[]) {
		System.out.println(a); // Direct access
		System.out.println(StaticVarEx01.a); // Using className
		// by creating object -> valid
	}
}
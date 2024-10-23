/*
 - When a class type variable is prefixed with the keyword static then it is called as static reference variable.
 - The static reference variables can be accessed directly within the class.
 */
class StaticRefVarEx01 {
	boolean x = true;

	void m1() {
		System.out.println("Inside m1 method...");
	}

	static StaticRefVarEx01 ref = new StaticRefVarEx01();

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		// Direct access
		System.out.println(ref.x);
		ref.m1();
		System.out.println("Stop @Cyber Success");
	}

}
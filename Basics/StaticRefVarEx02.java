/*
 - It is possible to declare the static reference variables on one line and initialize them on another line in another method, constructor, or block.
 */
class StaticRefVarEx02 {
	boolean x = true;

	void m1() {
		System.out.println("Inside m1 method...");
	}

	static StaticRefVarEx02 ref;

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		ref = new StaticRefVarEx02();
		System.out.println(ref.x);
		ref.m1();
		System.out.println("Stop @Cyber Success");
	}

}
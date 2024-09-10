/*
 Assingment question : 1
 */
class LocalRefVarEx02 {
	boolean x = true;

	void test() {

		System.out.println("Inside test method...");
	}

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		LocalRefVarEx02 ref = new LocalRefVarEx02();
		m1(ref);
		System.out.println("Stop @Cyber Success");
	}

	static void m1(LocalRefVarEx02 ref) {

		System.out.println("Inside m1 method...");
		System.out.println(ref.x);
		ref.test();
	}

}
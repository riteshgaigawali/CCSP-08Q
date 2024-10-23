/* 
 Assingment question : 2
 */
class LocalRefVarEx03 {
	boolean x = true;

	void test() {

		System.out.println("Inside test method...");
	}

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		LocalRefVarEx03 ref = m1();
		System.out.println(ref.x);
		ref.test();
		System.out.println("Stop @Cyber Success");
	}

	static LocalRefVarEx03 m1() {
		System.out.println("Inside m1 method...");
		LocalRefVarEx03 ref = new LocalRefVarEx03();
		return ref;
	}

}
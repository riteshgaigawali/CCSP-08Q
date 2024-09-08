/*
 - The return-by-value can also be used to return the local variable's data from one method to another method.
 */
class StaticMethodEx08 {
	public static void main(String args[]) {

		System.out.println("Start @Cyber Success");
		int result = test();
		System.out.println(result);
		System.out.println("Stop @Cyber Success");
	}

	static int test() {
		System.out.println("Inside method6...");
		int result = 10 + 20;
		return result;
	}

}
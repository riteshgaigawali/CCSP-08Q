/*
 - The return statement should always be the last statement within the method.
 */
class StaticMethodEx02 {

	public static void main(String args[]) {
		System.out.println("Start @CyberSuccess ");
		method2();
		System.out.println("End @CyberSuccess ");

	}

	static void method2() {
		return; // Invalid
		System.out.println("Inside method2... ");

	}
}
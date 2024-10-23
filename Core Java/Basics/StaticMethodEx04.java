/*
 - What is output of the following code ?
 --> It will throw an error as the first return statement returns the control to main, hence the control could never reach the second return statement and compiler will throw error as unreachable statement. 
 */
class StaticMethodEx04 {

	public static void main(String args[]) {
		System.out.println("Start @CyberSuccess ");
		method4();
		System.out.println("End @CyberSuccess ");

	}

	static void method4() {

		System.out.println("Inside method2... ");
		return;
		return; // error: unreachable statement

	}
}
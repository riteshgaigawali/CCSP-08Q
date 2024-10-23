/*
 Assignment question : 1
 */
class A {
	static int method2(int a) {

		int result1 = a + 100;
		return result1;
	}
}

class B {
	static float method1(float b) {

		float result2 = b + 200;
		return result2;
	}

}

class StaticMethodEx10 {

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		int a = 10;
		float b = 20.5f;

		float result1 = B.method1(b);
		int result2 = A.method2(a);
		System.out.println(result1 + result2);

		System.out.println("Stop @Cyber Success");
	}

}
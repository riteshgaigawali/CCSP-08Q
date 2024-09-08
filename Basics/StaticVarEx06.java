/*
 Assignment question : 1
 */
class Demo1 {

	static float a = 20.5f;
}

class StaticVarEx06 {
	static int b = 10;

	public static void main(String args[]) {

		float result = Demo1.a + b;
		System.out.print(result);
	}

}
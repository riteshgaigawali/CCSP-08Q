/*
 Assignment question : 2
 */
class Demo1 {

	static int a = 200;
}

class Sample1 {
	static float b = 100.5f;
}

class StaticVarEx07 {

	static float result;

	public static void main(String args[]) {

		result = Demo1.a + Sample1.b;
		System.out.print(result);
	}

}
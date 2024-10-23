/*
 Assignment question : 1
 */
class Demo {
	int a = 100;
	static float b;
}

class Sample {
	static int x;
	float y = 200.5f;
}

class NonStaticVarEx04 {

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");

		Demo d = new Demo();
		Sample s = new Sample();

		Demo.b = s.y;
		Sample.x = d.a;

		System.out.println(Sample.x);
		System.out.println(Demo.b);
		System.out.println("Stop @Cyber Success");
	}
}
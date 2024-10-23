/*
 Assingment question : 2
 */
class Demo {
	int a = 100;
}

class Sample {
	static float x = 200.5f;
}

class Cyber {
	float result;
}

class NonStaticVarEx05 {
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		Demo d = new Demo();
		Cyber c = new Cyber();
		c.result = d.a + Sample.x;
		System.out.println(c.result);
		System.out.println("Stop @Cyber Success");
	}
}
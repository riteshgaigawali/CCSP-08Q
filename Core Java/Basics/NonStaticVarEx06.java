/*
 Assignment question : 3
 */
class Cyber {
	int x = 100;
}

class Success {
	static int y = 200;
}

class Training {
	int temp;
}

class NonStaticVarEx06 {
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		Cyber c = new Cyber();
		Training t = new Training();
		t.temp = c.x;
		c.x = Success.y;
		Success.y = t.temp;
		System.out.println(c.x);
		System.out.println(Success.y);
		System.out.println("Stop @Cyber Success");
	}
}
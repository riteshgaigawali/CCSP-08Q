/*
 - In pass-by-value we can either pass one variable or we can pass multiple variables. 
 */
class StaticMethodEx07 {
	public static void main(String args[]) {

		System.out.println("Start @Cyber Success");
		int a = 100, b = 200;
		add(a, b);
		System.out.println("Stop @Cyber Success");
	}

	static void add(int x, int y) {
		System.out.println("Inside method6...");
		System.out.println(x + y);
	}

}
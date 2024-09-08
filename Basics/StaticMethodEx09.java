/*
 - A method can accept multiple values/parameters, but cannot return more than one value.
 */
class StaticMethodEx09 {
	public static void main(String args[]) {

		System.out.println("Start @Cyber Success");
		int result = test();
		System.out.println(result);
		System.out.println("Stop @Cyber Success");
	}

static int test(){
	System.out.println("Inside method6...");
	int add = 10 + 20;
	int mul = 10 * 20;
	return add , mul; // This will give CTE; it is invalid.
}

}
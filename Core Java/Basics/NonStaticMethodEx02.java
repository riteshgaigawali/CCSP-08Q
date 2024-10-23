/*
 - Return statement is used to return back to the caller method.
 - We use 'void' as a return type whenever the method only return the control but no data.
 - However if a method return a data then based on that data we have to also mention the return type.
 */
class NonStaticMethodEx02 {
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");

		int a = 10;
		float b = 20.5f;

		NonStaticMethodEx02 nm = new NonStaticMethodEx02();
		float result = nm.m1(a, b);

		System.out.println(result);
		System.out.println("Stop @Cyber Success");
	}

	float m1(int a, float b) {
		System.out.println("Inside m1 method....");
		float result = a + b;
		return result;
	}
}
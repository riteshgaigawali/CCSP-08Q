/*
 - We can't make local variables as static.
 */
class StaticVarEx08 {

	public static void main(String args[]) {

		static int a = 10; // error: Illegal modifier for parameter a; only final is permitted.

		System.out.print(a);
	}
}
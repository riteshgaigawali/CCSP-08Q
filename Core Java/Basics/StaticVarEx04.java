/*
 - Is it mandatory to initialize static variables before printing ?
 --> No, it is not mandatory to initialize static variables before printing, because it prints the default values.

 - If we would not give any value to the static vaiables, then the compiler will set the default value during compilation.
 */
class StaticVarEx04 {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;

	public static void main(String args[]) {

		// It will print default value for each datatype.

		System.out.println(b);

		System.out.println(s);

		System.out.println(i);

		System.out.println(l);

		System.out.println(f);

		System.out.println(d);

		System.out.println(c);

		System.out.println(bool);

	}
}
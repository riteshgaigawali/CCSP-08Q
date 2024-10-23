/*
 - The dot( . ) operator is also called as an access operator is used only when we want to access a member within a specific area.
 */
class StaticVarEx02 {
	static int a = 100;
	static float b = 200.5f;

	public static void main(String args[]) {

		float result = a + StaticVarEx02.b;
		System.out.print(result);
	}
}
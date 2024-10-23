/*
- How will you make a variable behave as a constant ?
 - How will you ensure that the variable's value doesn't change ?
 --> By prefixing 'final' keyword before any variable we can ensure that the variable value doesn't change.
 */
class FinalKeyword {

	public static void main(String args[]) {

		final int a = 10;
		// a=100; error: cannot assign a value to final variable a

		System.out.print(a);
	}

}
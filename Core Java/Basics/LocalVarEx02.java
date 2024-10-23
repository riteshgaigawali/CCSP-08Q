/*
 - Is it mandatory to initialize a local varible before printing ?
 --> Yes, it is mandatory because Java doesn't support/print garbage values as C/C++, hence it will give compile-time error.
 - Where exactly the local variables are created in the memory ?
 --> The local variables are created within the stack area inside the memory.
 */
class LocalVarEx02 {

	public static void main(String args[]) {

		int a;
		System.out.print(a);// error: variable a might not have been initialized
	}

}
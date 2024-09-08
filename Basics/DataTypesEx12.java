/*
 C/C++ also supports character datatype, but it consumes 1Byte of memory whereas in Java it consumes 2Byte of memory. Why?
 --> C/C++ technologies primarily support English language hence 1Byte memory was sufficient, however Java not only supports English language but also supports other languages as well hence 1Byte of memory is not sufficent hence consumes 2Byte of memory. 
 */
class DataTypesEx12 {
	public static void main(String args[]) {

		char x = 'a';
		System.out.println(x);
		char y = 99;
		System.out.println(y);
		System.out.println((int) y);

	}

}
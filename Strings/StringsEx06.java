/*
2) StringBuffer

- StringBuffer is a class in Java that represents a mutable sequence of characters. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.
- It is part of java.lang package.
- StringBuffer object cannot be created without new keyword.
- javap java.lang.StringBuffer --> to see constructors & methods within the StringBuffer class.
- Whenever we print the reference variable of StringBuffer class it prints the value instead of address because StringBuffer class overrides the toString method from Object class.

*/
class StringsEx06{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//StringBuffer sbf = "Cyber"; Invalid
		
		StringBuffer sbf = new StringBuffer("Cyber");
		System.out.println(sbf);
		System.out.println(sbf.toString());
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
1. public java.lang.StringBuffer()
2. public java.lang.StringBuffer(int)
3. public java.lang.StringBuffer(java.lang.String)
4. public java.lang.StringBuffer(java.lang.CharSequence)

*/
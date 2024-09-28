/*
- How do we convert a wrapper object to primitive type ?
>> Using xxxxxValue() methods we can convert wrapper object to primitive type :

1) public byte byteValue();
2) public short shortValue();
3) public int intValue();
4) public long longValue();
5) public float floatValue();
6) public double doublevalue();
7) public char charValue();
8) public boolean booleanValue();

- In all the wrapper classes we have xxxxxValue() method.

*/
class WrapperClassEx06{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Character c = new Character('X');
		System.out.println(c.toString());
		
		char ch = c.charValue();
		//System.out.println(ch.toString); error: char cannot be dereferenced 
		System.out.println(ch);
		
		Boolean b = new Boolean("true");
		System.out.println(b.toString());
		
		boolean bl = b.booleanValue();
		//System.out.println(bl.toString); error: boolean cannot be dereferenced
		System.out.println(bl);
		
		System.out.println("Stop @Cyber Success");
	}
}
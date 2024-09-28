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
class WrapperClassEx05{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Integer i = new Integer(100);
		System.out.println(i.toString());
		
		int a = i.intValue();
		//System.out.println(a.toString); error: int cannot be dereferenced
		System.out.println(a);
		
		System.out.println("Stop @Cyber Success");
	}
}
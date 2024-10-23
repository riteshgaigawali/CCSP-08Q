/*
- A Wrapper class in Java is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object. 

- All the Wrapper classes by nature are immutable.

- How many ways are there to create Integer wrapper objects ?
>> There are two constructors supported by Java to create Integer wrapper objects :
							
					1) public java.lang.Integer(int);
					2) public java.lang.Integer(java.lang.Stirng) throws java.lang.NumberFormatException;

*/
class WrapperClassEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Integer i1 = new Integer(100);
		System.out.println(i1);
		System.out.println(i1.toString());
		
		Integer i2 = new Integer("100");
		System.out.println(i2);
		System.out.println(i2.toString());
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- How many ways are there to convert primitive type data to non-primitive type data ?
>> There are two ways to convert primitive type data to non-primitive type data :
		
		1) Using Wrapper class constructors.
		2) Using the public static java.lang.Integer valueOf(int) method.
*/
class WrapperClassEx04{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int a = 100;
		
		//System.out.println(a.toString()); error: int cannot be dereferenced
		
		Integer i = Integer.valueOf(a);
		System.out.println(i.toString());
		
		System.out.println("Stop @Cyber Success");
	}
}
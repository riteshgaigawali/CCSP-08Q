/*
- How do we convert StringBuffer to String ?
>> There are two approach to convert StringBuffer to String :
Approach 1 - Using String class constructor.
Approach 2 - Using toString() method.

- How do we know that StringBuffer is converted to String ?
>> To check that StringBuffer is converted to String or not we can use reverse() and append() methods that are present in StringBuffer only.

*/
class StringsEx13{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		StringBuffer sbf = new StringBuffer("Technology");
		
		//Approach 1
		String str1 = new String(sbf);
		System.out.println(str1);
		//System.out.println(str1.append()); error: cannot find symbol | symbol:   method append()
		
		//Approach 2
		String str2 = sbf.toString();
		System.out.println(str2);
		//System.out.println(str2.append()); error: cannot find symbol | symbol:   method append()
		
		System.out.println("Stop @Cyber Success");
	}
}
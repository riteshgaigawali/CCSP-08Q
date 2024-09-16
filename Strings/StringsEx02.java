/*
Is there any difference in String object creation using new keyword and without using new keyword ?
>> 

1. Without using new keyword :

- Whenever we create any String object without using new keyword these objects are created in the String constant pool.
- Before creating any object in String constant pool it will first check whether respective object present or not.
- If the object is not present only then it will create a new object however if the object is present then it will not create a new object it will point to the existing object.

*/
class StringsEx02{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = "Cyber";
		String str2 = "Success";
		String str3 = "Cyber";
		
		System.out.println(str1 == str3);//true
		System.out.println(str2);
		System.out.println(str3 == str1);//true
		
		System.out.println("Stop @Cyber Success");
	}
}
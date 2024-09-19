/*
String Classes

- Anything within the " " (double quotes) is called as Stirng.(Anything eg. characters, numbers, or symbols).
- There are 4 types of String classes supported by Java :
1. String 
2. StringBuffer
3. StringBuilder
4. StringTokenizer

1) String

- String is a part of java.lang package.
- How may ways there are to create String objects ?
>> There are two ways to create String objects :
1. Without using new keyword.
2. Using new keyword.

*/
class StringsEx01{
	public static void main(String args[]){
		
		System.out.println("Start @Cyber Success");
		
		//Approach 1 - without using new keyword
		String str1 = "Cyber";
		System.out.println(str1);
		
		//Approach 2 - using new keyword
		String str2 = new String("Success");
		System.out.println(str2);
		
		System.out.println("Stop @Cyber Success");
		
	}
}

//public java.lang.String(java.lang.String)
/*
- Important methods in Java :

1) public char charAt(int index) :-
The Java String class charAt() method returns a char value at the given index number.
The index number starts from 0 and goes to n-1, where n is the length of the string. It returns StringIndexOutOfBoundsException, if the given index number is greater than or equal to this string length or a negative number.

2) public int indexOf(String str) :-

The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string. (read more on internet)
If the specified character or string is not present then it returns -1.

3) public int lastIndexOf(String str) :-

The Java String class lastIndexOf() method returns the last index of the given character value or substring. If it is not found, it returns -1. The index counter starts from zero.

4) public int length() :-

The Java String class length() method finds the length of a string. The length of the Java string is the same as the Unicode code units of the string.
*/
class StringsEx16{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "CyberOne";
		
		System.out.println(str.charAt(2));//b
		//System.out.println(str.charAt(20)); java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		
		System.out.println(str.indexOf("e"));//3
		System.out.println(str.indexOf("z"));//-1
		
		System.out.println(str.lastIndexOf("e"));//7
		System.out.println(str.lastIndexOf("z"));//-1
		
		System.out.println(str.length());//8
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Some More Methods in String :

1) public String toUpperCase() :-

The java string toUpperCase() method returns the string in uppercase letter. In other words, it converts all characters of the string into upper case letter.

2) public String toLowerCase() :-

The java string toLowerCase() method returns the string in lowercase letter. In other words, it converts all characters of the string into lower case letter.

3) public boolean startsWith(String prefix) :-

The Java String class startsWith() method checks if this string starts with the given prefix. It returns true if this string starts with the given prefix; else returns false.

4) public boolean endsWith(String sufix) :-

The Java String class endsWith() method checks if this string ends with a given suffix. It returns true if this string ends with the given suffix; else returns false.

5) public boolean contains(CharSequence seq) :-

The Java String class contains() method searches the sequence of characters in this string. It returns true if the sequence of char values is found in this string otherwise returns false.

*/
class StringsEx17{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "CyberSuccess";
		
		System.out.println(str.toUpperCase());// CYBERSUCCESS
		
		System.out.println(str.toLowerCase());// cybersuccess
		
		System.out.println(str.startsWith("Cyb"));// true
		System.out.println(str.startsWith("Succ"));// false
		
		System.out.println(str.endsWith("ess"));// true
		System.out.println(str.endsWith("ber"));// false
		
		System.out.println(str.contains("erSuc"));// true
		System.out.println(str.contains("ersuc"));// false
		
		System.out.println("Stop @Cyber Success");
	}
}
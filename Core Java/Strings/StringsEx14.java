/*
- The Java compareTo() method compares the given string with the current string lexicographically. It returns a positive number, a negative number, or 0. It compares strings based on the Unicode value of each character in the strings.
- The compareTo() method is present in an interface called as 'Comparable', String class implements Comparable interface and override the compareTo() method.
- Syntax :   int comparison = str1.compareTo(str2);
- Parameters:
				str1: String 1 for comparison
				str2: String 2 for comparison
- Returns:

				if string1 > string2, it returns positive number
				if string1 < string2, it returns negative number
				if string1 == string2, it returns 0

*/
class StringsEx14{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
	/*	String str1 = "Cyber";
		String str2 = "Cyber";
		System.out.println(str1.compareTo(str2));//0
	*/

	    String str1 = new String("Cyber");
		String str2 = new String("Cyber");
		System.out.println(str1.compareTo(str2));//0
	
	
		String str3 = new String("Amber");
		String str4 = new String("Cyber");
		System.out.println(str3.compareTo(str4));//-2
		
		String str5 = new String("Cyber");
		String str6 = new String("Amber");
		System.out.println(str5.compareTo(str6));//2
		
		System.out.println("Stop @Cyber Success");
	}
}

/*
- The equals() method compares two strings, and returns true if the strings are equal, and false if not.
- The String equals() method overrides the equals() method of the Object class.
- The equals() method of the String class compares the content of two strings. It returns false if any of the characters are not matched. It returns true if all characters are matched in the Strings. It compares the value’s character by character, irrespective of whether two strings are stored in the same memory location. 
*/
class StringsEx09{
	public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	
	String str1 = "Cyber";
	String str2 = "Success";
	String str3 = "Cyber";
	System.out.println(str1.equals(str3));//true
	System.out.println(str2.equals(str3));//false
	System.out.println(str3.equals(str2));//false
	
	System.out.println(" ----------------------------------------------");
	
	String str4 = new String("Cyber");
	String str5 = new String("Success");
	String str6 = new String("Cyber");
	System.out.println(str4.equals(str6));//true
	System.out.println(str5.equals(str6));//false
	System.out.println(str6.equals(str4));//true
	
	
	System.out.println("Stop @Cyber Success");
	}
}
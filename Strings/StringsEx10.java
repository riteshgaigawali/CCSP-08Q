/*
- The equals() method of the String class compares the content of two strings. It returns false if any of the characters are not matched. It returns true if all characters are matched in the Strings. It compares the value’s character by character, irrespective of whether two strings are stored in the same memory location.

- However the equals() method of the StringBuffer class does the reference comparison. It returns false if the address of the both reference variables does not match. It returns true if the address is same. It whether two strings are stored in the same memory location irrespective of the content inside this objects.

*/
class StringsEx10{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = new String("Cyber");
		String str2 = new String("Success");
		String str3 = new String("Cyber");
		System.out.println(str1.equals(str3));//true
		System.out.println(str2.equals(str3));//false
		System.out.println(str3.equals(str1));//true
		
	    System.out.println(" ----------------------------------------------");
		
		StringBuffer sbf1 = new StringBuffer("Cyber");
		StringBuffer sbf2 = new StringBuffer("Success");
		StringBuffer sbf3 = new StringBuffer("Cyber");
		System.out.println(sbf1.equals(sbf3));//false
		System.out.println(sbf2.equals(sbf3));//false
		System.out.println(sbf3.equals(sbf1));//false
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
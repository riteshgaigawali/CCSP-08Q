/*
Substring in Java :

- A part of String is called substring. In other words, substring is a subset of another String. Java String class provides the built-in substring() method that extract a substring from the given string by using the index values passed as an argument. In case of substring() method startIndex is inclusive and endIndex is exclusive.

- You can get substring from the given String object by one of the two methods:

1) public String substring(int startIndex):
This method returns new String object containing the substring of the given string from specified startIndex (inclusive). The method throws an IndexOutOfBoundException when the startIndex is larger than the length of String or less than zero.

2) public String substring(int startIndex, int endIndex):
This method returns new String object containing the substring of the given string from specified startIndex to endIndex. The method throws an IndexOutOfBoundException when the startIndex is less than zero or startIndex is greater than endIndex or endIndex is greater than length of String.

*/
class StringsEx19{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "CyberSuccessTraining";
		
		System.out.println(str.substring(5));// SuccessTraining -> inclusive means it print char at 5th index as well
		//System.out.println(str.substring(50)); java.lang.StringIndexOutOfBoundsException: String index out of range: -30
		
		System.out.println(str.substring(5,12));// Success -> exclusive means it excludes the 12th index
		//System.out.println(str.substring(5,30)); java.lang.StringIndexOutOfBoundsException: begin 5, end 30, length 20
		
		System.out.println("Stop @Cyber Success");
	}
}
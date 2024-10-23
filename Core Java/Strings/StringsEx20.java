/*
- public String trim() :

The Java String class trim() method eliminates leading and trailing spaces. The Unicode value of space character is '\u0020'. The trim() method in Java string checks this Unicode value before and after the string, if it exists then the method removes the spaces and returns the omitted string.

Since strings in Java are immutable; therefore, when the trim() method manipulates the string by trimming the whitespaces, it returns a new string. If the manipulation is not done by the trim() method, then the reference of the same string is returned. 


*/
class StringsEx20{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 =" Cyber ";
		System.out.println(str1);// " Cyber " 
		System.out.println("Before : " + str1.length());// 7
		String str2 = str1.trim(); // str2 <- "Cyber"
		System.out.println(str2);// "Cyber"
		System.out.println("Afrer : " + str2.length());// 5
		
		System.out.println("--------------------------------------------------------");
		
		String str3 ="One Two";
		System.out.println(str3);// "One Two" 
		System.out.println("Before : " + str3.length());// 7
		String str4 = str3.trim(); // str4 <- "One Two" : trim() eliminates the leading and trailing spaces only not in-between.
		System.out.println(str4);// "One Two"
		System.out.println("Afrer : " + str4.length());// 7
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
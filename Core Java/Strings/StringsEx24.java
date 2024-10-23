/*
4) StringTokenizer

- StreamTokenizer class is part of java.util package.
- The StringTokenizer class was introduced in Java 1.0, the classes introduced in Java 1.0 are also called as legacy classes thus the StringTokenizer is also called as a legacy class.
- The StringTokenizer class allows you to break a String into tokens. It is simple way to break a String.
- If the delimiter is not passed the default delimiter is used automaticaly which is a space(" ").
- After a String is tokenized, we need to extract the tokens, for which we can follow two steps :
	
	step 1 : Check whether the tokens are present or not using hasMoreElements() method.
	step 2 : extract tokens one by one using nextElement() method.

- To check whether the tokens are present or not we need to check it multiple times for that we use while loop.

*/
import java.util.StringTokenizer;

class StringsEx24{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "This is an example of StringTokenizer class in Java.";
		System.out.println(str);
		
		StringTokenizer stk = new StringTokenizer(str);
		
		while(stk.hasMoreElements()){
			System.out.println(stk.nextElement());
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/* 
1. public java.util.StringTokenizer(java.lang.String) -> converts String to StringTokenizer

2. public boolean hasMoreElements() -> This method returns true if more tokens are available in the tokenizer String otherwise returns false.

3. public boolean hasMoreElements() -> This method returns the same value as hasMoreTokens() method of StringTokenizer class. The only difference is this class can implement the Enumeration interface.

4. public java.lang.Object nextElement() -> nextElement() returns the next token object in the tokenizer String. It can implement Enumeration interface.

*/
/*
		* Scanner Class
		
- Scanner class is primarily used to perform scan operation or read operation.
- Scanner class can either scan from a console/ keyboard, a String, a file or an input stream.
- The Scanner while scanning from any source of input will scan token-by-token.
- A token can be defined as the smallest element in the complete information.
- The Scanner class is the part of java.util package.

- In Scanner class once we scan the input from the String we have to perform two actions :
			1) To check if the token is present or not. (hasNext())
			2) To extract the tokens from the Scanner. (next())
			
- The hasNext() method is responsible to check whether the token is present or not, and the next() method is responsible to extractthe tokens form Scanner class.

*/

import java.util.Scanner;

class ScannerEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String info = "This is an example of Scanner extracting info from a String.";
		
		Scanner sc = new Scanner(info);
		
		while(sc.hasNext()){
			System.out.print(sc.next());
		}
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.util.Scanner(java.lang.String);
// public boolean hasNext();
// public java.lang.String next();
/*

- We can scan from FileInputStream using the Scanner class and extract information from the FileInputStream.
- In Scanner class once we scan the input from a FileInputStream we have to perform two actions :
			1) To check if the token is present or not. (hasNext())
			2) To extract the tokens from the Scanner. (next())
			
- The hasNext() method is responsible to check whether the token is present or not, and the next() method is responsible to extractthe tokens form Scanner class.

*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ScannerEx04{
	public static void main(String args[]) throws FileNotFoundException{
		System.out.println("Start @Cyber Success");
		
		FileInputStream fis = new FileInputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ScannerRead.txt");
		Scanner sc = new Scanner(fis);
		
		while(sc.hasNext()){
			System.out.print(sc.next());
		}
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.io.FileInputStream(java.lang.String);
// public java.util.Scanner(java.io.FileInputStream) throws java.io.FileNotFoundException;
// public boolean hasNext();
// public java.lang.String next();
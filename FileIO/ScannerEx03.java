/*

- We can also scan from console/keyboard using the Scanner class.
- In Scanner class once we scan the input from a console/keyboard we have to perform two actions :
			1) To check if the token is present or not. (hasNext())
			2) To extract the tokens from the Scanner. (next())
			
- The hasNext() method is responsible to check whether the token is present or not, and the next() method is responsible to extractthe tokens form Scanner class.

*/
import java.util.Scanner;

class ScannerEx03{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			System.out.print(sc.next());
		}
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.util.Scanner(java.io.InputStream);
// public static final java.io.InputStream in; <-- java.lang.System
// public boolean hasNext();
// public java.lang.String next();
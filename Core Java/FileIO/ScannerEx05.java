/*
- Write a Java program to scan a complete line using Scanner class.
>> To scan a complete line using Scanner class we can use nextLine() line method which scans the complete line.
*/
import java.util.Scanner;

class ScannerEx05{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			System.out.print(sc.nextLine());
		}
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.util.Scanner(java.io.InputStream);
// public static final java.io.InputStream in; <-- java.lang.System
// public boolean hasNext();
// public java.lang.String nextLine();
/*
		* FileIO :
		
- What is the use of FileIO ?
>> FileIO can be defined as a set of classes and interfaces which are ment to move the content from source to destination.

- Java supports two kinds of Stream channels :-
		1) Byte-oriented Stream channel
		2) Character-oriented Stream channel
		
- What is a Channel ?
>> A medium for data transfer or the pipeline to send and receive data is called as Channel.
   Every channel has two things :-
		1) Reading and 2) Writting
		
- A Stream can be defined as a sequence of data.

		#1. Byte-oriented Stream Channel :
			
			- In Byte-oriented Stream Channel to perform read and write operations there are two classes which are supported :
					1) InputStream class (abstract)
					2) OutputStream class (abstract)
					
			- As above classes by nature are abstract we have to go for Child classes :-
					1) FileInputStream class
					2) FileOutputStream class
		
Note :- It is mandatory to create the source file but it is not mandatory to create the destination file. If we do not create the destination file Java compiler will create the destination file.

- Once we perform read and write operations we need to close the channels and to close both the channels we will be using the method called as close().

*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;


//Byte-oriented Stream Channel
class Example01{
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		System.out.println("Start @Cyber Success");
		
		FileInputStream fis = new FileInputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteReadSource.txt");
		
		FileOutputStream fos = new FileOutputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteWriteDestination.txt");
		
		int info;
		
		while((info = fis.read()) != -1){
			
			System.out.print((char)info);
			
			fos.write(info);
		}
		
		fis.close();
		fos.close();
		
		System.out.println("\nStop @Cyber Success");
	}
}

// public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
// public int read() throws java.io.IOException;
// public void close() throws java.io.IOException;
// public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
// public void write(int) throws java.io.IOException;
// public void close() throws java.io.IOException;

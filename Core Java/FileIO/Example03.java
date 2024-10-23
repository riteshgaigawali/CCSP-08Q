/*
- There are many challeges using the previously explained ways in Example01 and 02 such as :

	- Whenever we want to read the content from a file everytime from the RAM area the request will be sent to the HDD, and depending on the number of char/bytes that many number of times it'll hit the HDD this will consume a lot of time.
	
	- For every reading operation hitting the HDD that many number of times will degrade the performance of the application.
	
	- Hence to overcome the above challeges we prefer to go for buffered streams.
	
	- Buffered stream can be categories mainly into two types :
				1) Byte-oriented Buffered Stream
				2) Character-oriented Buffered Stream
				
- Note : Buffered Streams Channels are dependent on the Normal Stream Channels.

 #1. Byte-oriented Buffered Stream :
 
	- In Byte-oriented Buffered Stream Channel to perform read and write operations there are two classes which are supported :
					1) InputStream class (abstract)
					2) OutputStream class (abstract)
					
	- As above classes by nature are abstract we have to go for Child classes :-
					1) FileInputStream class
					2) FileOutputStream class
 
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;


//Byte-oriented Buffered Stream
class Example03{
	public static void main(String args[]) throws FileNotFoundException, IOException{
		System.out.println("Start @Cyber Success");
		
		//Byte-oriented FileInputStream
		FileInputStream fis = new FileInputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteBufferedReadSource.txt");
		//Byte-oriented BufferedInputStream
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		//Byte-oriented FileOutputStream
		FileOutputStream fos = new FileOutputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteBufferedReadDestination.txt");
		//Byte-oriented BufferedOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int info;
		while((info = bis.read()) != -1){
			System.out.print((char)info);
			bos.write(info);
		}
		bos.flush();
		
		fis.close(); bis.close();
		fos.close(); bos.close();
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
// public java.io.BufferedInputStream(java.io.InputStream);
// public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
// public java.io.BufferedOutputStream(java.io.OutputStream);
// public synchronized int read() throws java.io.IOException; <-- java.io.BufferedInputStream
// public synchronized void write(int) throws java.io.IOException; <-- java.io.BufferedOutputStream
// public synchronized void flush() throws java.io.IOException; <-- java.io.BufferedOutputStream
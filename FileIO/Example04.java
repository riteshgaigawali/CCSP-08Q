/*

	#2. Character-oriented Buffered Stream :
			
		- In a Character-oriented Stream Channel we perform both read and write operations.
		- To perform read and write operations there are two classes which are supported :
					1) Reader class (abstract)
					2) Writer class (abstract)
						
		- Reader and Writer classes by nature are abstract, hence we go for Child classes :
					1) BufferdReader class 
					2) BufferedWriter class

*/

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

// Character-oriented Buffered Stream
class Example04{
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		System.out.println("Start @Cyber Success");
		
		//Char-oriented FileReader
		FileReader fr = new FileReader("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteBufferedReadSource.txt");
		//Char-oriented BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		//Char-oriented FileWriter
		FileWriter fw = new FileWriter("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\ByteBufferedReadDestination.txt");
		//Char-oriented BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		int info;
		while((info = br.read()) != -1){
			System.out.print((char)info);
			bw.write(info);
		}
		bw.flush();
		
		fr.close(); br.close();
		fw.close(); bw.close();
		
		System.out.println("\nStop @Cyber Success");
	}
}
// public java.io.FileReader(java.lang.String) throws java.io.FileNotFoundException;
// public java.io.BufferedReader(java.io.Reader);
// public int read() throws java.io.IOException; <-- java.io.BufferedReader
// public java.io.FileWriter(java.lang.String) throws java.io.IOException;
// public java.io.BufferedWriter(java.io.Writer);
// public void write(int) throws java.io.IOException; <-- java.io.BufferedWriter
// public void flush() throws java.io.IOException;

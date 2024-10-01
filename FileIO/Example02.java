/*
		#2. Character-oriented Stream Channel :-
		
			- In a Character-oriented Stream Channel we perform both read and write operations.
			- To perform read and write operations there are two classes which are supported :
						1) Reader class (abstract)
						2) Writer class (abstract)
						
			- Reader and Writer classes by nature are abstract, hence we go for Child classes :
						1) InputStreamReader class -> FileReader class
						2) OutputStreamWriter class -> FileWriter class

*/
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


//Character-oriented Stream Channel
class Example02{
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		System.out.println("Start @Cyber Success");
		
		FileReader fr = new FileReader("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\CharReadSource.txt");
		
		FileWriter fw = new FileWriter("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\CharWriteDestination.txt");
		
		int info;
		
		while((info = fr.read()) != -1){
			
			System.out.print((char)info);
			
			fw.write(info);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("\nStop @Cyber Success");
	}
}

// public java.io.FileReader(java.lang.String) throws java.io.FileNotFoundException;
// public int read() throws java.io.IOException; <-- java.io.InputStreamReader
// public void close() throws java.io.IOException; <-- java.io.InputStreamReader
// public java.io.FileWriter(java.lang.String) throws java.io.IOException;
// public void write(int) throws java.io.IOException;
// public void close() throws java.io.IOException;
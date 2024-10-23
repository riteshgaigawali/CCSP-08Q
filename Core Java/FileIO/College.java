/*
		* Serialization :

- Converting an object to the networking supported format is called as Serialization.
- The network supported format is txt in Java.

*/

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;

class College{
	public static void main(String args[]) throws FileNotFoundException, IOException{
		
		System.out.println("Start @Cyber Success");
		
		//Object of Student class
		Student s1 = new Student(101, "Ritesh");
		
		// FileOutputStream for supporting writing of object to the txt file.
		FileOutputStream fos = new FileOutputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\CollegeData.txt");
		
		//ObjectOutputStream for actually writing object to txt file.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		
		
		System.out.println("Stop @Cyber Success");
	}
}
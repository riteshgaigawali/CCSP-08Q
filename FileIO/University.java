/*
		* Deserialization

- Reading the object data from the network supported format is called as Deserialization.

*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class University{
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		System.out.println("Start @Cyber Success");
		
		// FileInputStream for supporting reading of object from the txt file.
		FileInputStream fis = new FileInputStream("R:\\Educational\\The Journey\\Code\\CyberSuccess-2024\\FileIO\\Files\\CollegeData.txt");
		
		//ObjectInputStream for actually reading object from txt file.
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//Upcast Student object to it's parent Object class.
		Object o = ois.readObject();
		
		//Downcast the object ot Student.
		Student s1 = (Student) o;
		
		System.out.println(s1.studId + " - " + s1.studName);
		
		System.out.println("Stop @Cyber Success");
	}
}
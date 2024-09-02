/*
- In a Java program we can create min one class, as well as we can create 'n' multiple classes.
- Multiple classes can contain the main() method.
- The compiler can compile all classes at on shot, but the JVM can only execute one class at a time.
- Based on total number of classes in Java program that many .class files will be created.
- Here multiple bytecode files will get created, because there are multiple classes in this program so for each class a new bytecode file will be created. (Sample1.class | Sample2.class | Sample3.class).
*/

class Sample1{
public static void main(String args[]){
		
		System.out.print("This is Sample1");
	}
}
class Sample2{
	
	public static void main(String args[]){
		
		System.out.print("This is Sample2");
	}

}
class Sample3{
public static void main(String args[]){
		
		System.out.print("This is Sample3");
	}
}
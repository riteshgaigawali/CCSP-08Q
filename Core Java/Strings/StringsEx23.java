/*
3) StringBuilder

- StringBuffer and StringBuilder classes are almost same, the main differnce is the methods of StringBuffer class are syncronized and the methods of StringBuilder class are unsyncronized.

- Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer class except that it is unsynchronized. It is available since JDK 1.5.

- The StringBuilder objects are mutalbe.

- Syncronized and Unsyncronized Methods :

 If a method is made syncronized only one thread is able to access that method at a time, where transactions are stable but performance is lower.
 
 If a method is made unsyncronized multiple threads can access that method at a time, where transactions are unstable but performance is high.
 
*/
class StringsEx23{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		StringBuilder sbu1 = new StringBuilder("Cyber");
		StringBuilder sbu2 = new StringBuilder("Cyber");
		
		System.out.println("Before : " + sbu1);
		
		System.out.println(sbu1.equals(sbu2));// false -> it does Reference comparison
		
		System.out.println("After : " + sbu1.reverse());// StringBuffer are mutable
		System.out.println("Again reversed : " + sbu1.reverse());// To show that actual sbu1 object is modifide in above line.
		
		System.out.println("Stop @Cyber Success");
	}
}
// public java.lang.StringBuilder(java.lang.String) -> to convert String object to StringBuilder.
// public java.lang.StringBuilder reverse()
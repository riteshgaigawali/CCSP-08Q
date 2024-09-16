/*
Whenever we print the reference variable of a normal class it prints the address inside it, on the other hands when we print the reference variable of String class it does not print the address inside it. Why ?
>>>
- Whenever we print the reference variable of normal class, it will always invoke the toString() method of Object class.
- The toString() method is responsible to print the address inside the reference variable.
- But whenever we print reference variable of String class, the toString() method of Object class is overriden hence the behaviour of toString() method is changed.
- Hence whenever toString() method is invoked it will invoke the toString() method form String class and will not print the address but print the actual value.

*/
/*
class Object{
	toString(){
		-------
		-------
		-------
	}
}
*/
class String1{
	
	@Override
	public String toString(){
		return "CyberSuccess";
	}
	
}
class StringsEx05 // extends Object
{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		StringsEx05 ref1 = new StringsEx05();
		System.out.println(ref1);// toString() --> Object
		System.out.println(ref1.toString());
		System.out.println(" ------------------------------------------");
		
		String1 ref2 = new String1();
		System.out.println(ref2);// toString() --> String1
		System.out.println(ref2.toString());
		System.out.println(" ------------------------------------------");
		
		String str = "Cyber";
		System.out.println(str);// toString() --> Stirng
		System.out.println(str.toString());
		
		System.out.println("Stop @Cyber Success");
	}
}
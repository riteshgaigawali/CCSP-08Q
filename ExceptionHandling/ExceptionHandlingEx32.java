/*
- In the checked exception we can  either handle an exception or we can deligate an exception.
- But when it comes to uncheked exceptions it can only be handle using try-catch block but cannot be deligated using throws keyword.	
- The program will not throw an error if you use throws keyword for uncheked exceptions, but it will not deligate the exception for uncheked type of exceptions.

- To handle checked exceptions what are the approaches ?
>> To handle checked exceptions there are two ways : 1) Using try-catch block and 2) Using throws keyword.

- To handle uncheked exceptions what are the approaches ?
>> To handle uncheked exceptions there is only one way to use try-catch block.

- Exceptions can either raised at compilation-time or at runtime but can be handled only at runtime.00

*/
class ExceptionHandlingEx32{
	
	
	static void m3() throws ArithmeticException{
		System.out.println("Inside m3 method.");
		System.out.println(10/0); //ExceptionHandlingEx32.m3(ExceptionHandlingEx32.java:12)
	}
	
	static void m2() throws ArithmeticException{
		System.out.println("Inside m2 method.");
		m3(); //ExceptionHandlingEx32.m2(ExceptionHandlingEx32.java:17)
	}
	
	static void m1(){
		System.out.println("Inside m1 method.");
		m2(); //ExceptionHandlingEx32.m1(ExceptionHandlingEx32.java:22)
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		m1(); //ExceptionHandlingEx32.main(ExceptionHandlingEx32.java:28)
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Output :

 Start @Cyber Success
 Inside m1 method.
 Inside m2 method.
 Inside m3 method.
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionHandlingEx32.m3(ExceptionHandlingEx32.java:12)
        at ExceptionHandlingEx32.m2(ExceptionHandlingEx32.java:17)
        at ExceptionHandlingEx32.m1(ExceptionHandlingEx32.java:22)
        at ExceptionHandlingEx32.main(ExceptionHandlingEx32.java:28)
		
*/


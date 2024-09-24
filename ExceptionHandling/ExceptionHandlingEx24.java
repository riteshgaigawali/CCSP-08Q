/*
- Problem with using try block with only finally block without catch block :

 The catch blocks are meant to handle an exception but finally block is not meant to handle an exception.

*/
class ExceptionHandlingEx24{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
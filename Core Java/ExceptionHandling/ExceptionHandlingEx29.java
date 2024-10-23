/*
- Any exception class reference variable will be responsible to print exception information.

- How many ways are there to print exception information ?
>> There are three ways to print the exception info :

1) Using toString() method
2) Using the getMessage() method
3) Using printStackTrace() method

*/
class ExceptionHandlingEx29{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0); 
		}
		catch(ArithmeticException ae){ 
			System.out.println("Inside catch block.");
			System.out.println(ae.toString());// java.lang.ArithmeticException: / by zero
			System.out.println(ae.getMessage());// / by zero
			ae.printStackTrace();// java.lang.ArithmeticException: / by zero
								//			at ExceptionHandlingEx29.main(ExceptionHandlingEx29.java:18)
		}
		
		System.out.println("Stop @Cyber Success");
	}

}
// public java.lang.String toString();
// public java.lang.String getMessage();
// public void printStackTrace();
/*
- Situation 2 : If an exception is raised within try block only then the finally block will get executed, but if an exception is raised outside the the try block finally block will never get executed.
*/
class ExceptionHandlingEx28{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		try{
			System.out.println("Inside try block.");
		}
		catch(ArithmeticException ae){ 
			System.out.println("Inside catch block.");
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
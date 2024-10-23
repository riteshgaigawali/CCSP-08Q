/*
- Exceptions raised within try block will be handled by the catch block, but if an exception is raised within the finally block it will lead to abnormal termination of the program.
*/
class ExceptionHandlingEx25{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0); 
		}
		catch(ArithmeticException ae){ 
			System.out.println("Inside catch block.");
		}
		finally{
			System.out.println("Inside finally block.");
			System.out.println(10/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero

		}
		
		System.out.println("Stop @Cyber Success");
	}
}
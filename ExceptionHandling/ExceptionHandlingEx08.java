/*
- If an exception is raised within the try block it'll be handled by the catch block, but if an exception is raised within the catch block it'll lead to have an abnormal termination.

*/
class ExceptionHandlingEx08{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(10/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Even after an abnormal termination the finally block will always get executed, before JVM shuts-down.
*/
class ExceptionHandlingEx22{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
		}
		catch(NullPointerException np){ 
			System.out.println("Inside catch block.");
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- After a normal termination the finally block will always get executed, before JVM shuts-down.
*/
class ExceptionHandlingEx21{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);  //ArithmeticException
		}
		catch(ArithmeticException ae){ 
			System.out.println("Inside catch block.");
			System.out.println(ae);// java.lang.ArithmeticException: / by zero
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
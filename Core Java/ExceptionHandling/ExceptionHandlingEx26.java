/*
- If an exception is raised within the finally block it can be handled using try-catch block within the finally block.
*/
class ExceptionHandlingEx26{
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
			
			try{
			System.out.println("Inside try block within finally block.");
			System.out.println(10/0); 
			}
			catch(ArithmeticException ae){ 
			System.out.println("Inside catch block within finally block.");
			}
			
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
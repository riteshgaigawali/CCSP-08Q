/*
- Neverever write generic statements inside try block.
- Neverever write generic statements after the exception, chances are there they will never get executed.
- Because whenever the control moves out of the try block, the control will neverever return to the try block. 

*/
class ExceptionHandlingEx10{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0); // ArithmeticException -> the control will move out of try.
			System.out.println("Generic statements.....");// This statement will never get executed as the control is moved out of try block from the above statement.
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(ae);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
Output :- 

 Start @Cyber Success
 Inside try block.
 Inside catch block.
 java.lang.ArithmeticException: / by zero
 Stop @Cyber Success

*/
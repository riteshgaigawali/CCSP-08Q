/*
Finally Block :-

- What exactly the use of finally block ?
>> The finally block is used to execute certain tasks/operations before JVM shuts-down.

- In real-time when exactly we use finally block ?
>> In real-time we use finally block to destroy objects, to close the channel and streams and to close the database connections.

- If there are any instructions to be executed before JVM shuts-down, we put those instructions in finally block.
- Syntax : try{
	
				}
		   catch(){
			   
		   }
		   finally{
			   
		   }
		   
*/
class ExceptionHandlingEx20{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			//System.out.println(10/0);
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
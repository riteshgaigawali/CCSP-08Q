/*

- Only when an exception is raised within the try block, then only control will go to the catch block.
- If the exception is not raised the control will never go inside the catch block.

*/
class ExceptionHandlingEx06{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Java will never be bothered what type of exception is mentioned within the catch block if the exception doesn't go to the catch block, but if the exception goes to the catch block then Java will be specific about the type of exception mentioned within the catch block.
*/
class ExceptionHandlingEx19{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			//System.out.println(10/0);  ArithmeticException
		}
		catch(NullPointerException np){ 
			System.out.println("Inside catch block.");
			System.out.println(np);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
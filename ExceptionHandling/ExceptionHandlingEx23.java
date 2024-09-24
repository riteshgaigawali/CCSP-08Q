/*
- Is catch block mandatory along with try block ?
>> No it is not mandatory but instead of catch we have to use finally, independent try blocks are not allowed in Java.
*/
class ExceptionHandlingEx23{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
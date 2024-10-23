/*
Can you give few situations where the finally block will never get executed ?
>> There are two situations where the finally block will never get executed :-

- Situation 1 : Using System.exit(int status) method can make the JVM shut-down in such a way, that the finally block will never get executed.

*/
class ExceptionHandlingEx27{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.exit(0); // Normal termination --> 0 status will be normal termination
		}
		finally{
			System.out.println("Inside finally block.");
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
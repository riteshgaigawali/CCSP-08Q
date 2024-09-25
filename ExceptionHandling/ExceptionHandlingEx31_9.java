/*
- Using 'throws' keyword at the last caller method the exception is deligated to the JVM, if the JVM is able to handle, it will result in normal termination and if the JVM is not able to handle it will result in abnormal termination of program.
*/
class ExceptionHandlingEx31_9{
	
	static void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer method.");
		Thread.sleep(3000);// ---> exception deligated to line no:13 because of 'throws' keyword
	}
	
	static void marriageAgent() throws InterruptedException{
		System.out.println("Inside marriageAgent method.");
		marriageOfficer(); // ---> exception deligated to line no:18 because of 'throws' keyword
	}
	
	static void marriageOffice() throws InterruptedException{
		System.out.println("Inside marriageOffice method.");
		marriageAgent(); // ---> exception deligated to line no:24 because of 'throws' keyword
	}
	
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Start @Cyber Success");
		
		marriageOffice();// ---> exception deligated to JVM because of 'throws' keyword, and if possible JVM will handle it.
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Another example of exception deligation.
*/
class ExceptionHandlingEx31_7{
	
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
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		marriageOffice();// error: unreported exception InterruptedException; must be caught or declared to be thrown
		
		System.out.println("Stop @Cyber Success");
	}
}
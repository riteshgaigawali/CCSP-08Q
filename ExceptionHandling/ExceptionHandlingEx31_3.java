/*
    * 'throws' Keyword :

- The throws keyword is responsible to deligate the exceptions.
- The throws keyword is never used to handle the exceptions

*/
class ExceptionHandlingEx31_3{
	
	static void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer method.");
		Thread.sleep(3000);// ---> exception deligated to line no:17 because of 'throws' keyword
	}
	
	static void marriageAgent(){
		System.out.println("Inside marriageAgent method.");
		marriageOfficer(); // error: unreported exception InterruptedException; must be caught or declared to be thrown
	}
	
	static void marriageOffice(){
		System.out.println("Inside marriageOffice method.");
		marriageAgent();
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		marriageOffice();
		
		System.out.println("Stop @Cyber Success");
	}
}
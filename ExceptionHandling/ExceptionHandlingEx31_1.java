/*
- Plot for 'throws' keyword : if a method raise an exception it affects all of its caller methods.
*/
class ExceptionHandlingEx31_1{
	
	static void marriageOfficer(){
		System.out.println("Inside marriageOfficer method.");
		Thread.sleep(3000);// error: unreported exception InterruptedException; must be caught or declared to be thrown
	}
	
	static void marriageAgent(){
		System.out.println("Inside marriageAgent method.");
		marriageOfficer();
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
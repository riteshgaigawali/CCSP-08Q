/*
- Another example of there is only one way to handle the exception that is using try-catch block.
*/
class ExceptionHandlingEx31_6{
	
	static void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer method.");
		Thread.sleep(3000);// ---> exception deligated to line no:13 because of 'throws' keyword
	}
	
	static void marriageAgent() throws InterruptedException{
		System.out.println("Inside marriageAgent method.");
		marriageOfficer(); // ---> exception deligated to line no:18 because of 'throws' keyword
	}
	
	static void marriageOffice(){
		System.out.println("Inside marriageOffice method.");
		// exception will be handled here
		try{
			marriageAgent();
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
		 
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		marriageOffice();
		
		System.out.println("Stop @Cyber Success");
	}
}
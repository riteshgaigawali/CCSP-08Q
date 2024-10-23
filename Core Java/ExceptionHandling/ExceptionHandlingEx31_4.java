/*
- How many ways are there to handle the exception ?
>> There is only one way to handle the exception that is using try-catch block.

*/
class ExceptionHandlingEx31_4{
	
	static void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer method.");
		Thread.sleep(3000);// ---> exception deligated to line no:17 because of 'throws' keyword
	}
	
	static void marriageAgent(){
		System.out.println("Inside marriageAgent method.");
		// exception handled using try-catch block
		try{
			marriageOfficer();
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
		 
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
/*
- If the exception is handled within the method it is being raised, the program will terminate normally.
*/
class ExceptionHandlingEx31_2{
	
	static void marriageOfficer(){
		System.out.println("Inside marriageOfficer method.");
		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
			}
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
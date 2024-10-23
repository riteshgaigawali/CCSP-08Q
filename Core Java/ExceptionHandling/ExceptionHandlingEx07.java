/*
- Regardless of exception raised or not the independent try blocks are not allowed in Java.
*/
class ExceptionHandlingEx07{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// error: 'try' without 'catch', 'finally' or resource declarations
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
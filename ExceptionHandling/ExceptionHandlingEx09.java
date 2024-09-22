/*
- We cannot use after the try block and before the catch block.
*/
class ExceptionHandlingEx09{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//error: 'try' without 'catch', 'finally' or resource declarations
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);
		}
		System.out.println("Statement after try and before catch.");
		//error: 'catch' without 'try'
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(ae);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
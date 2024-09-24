/*
- We can create multiple catch blocks for one try block, however the order of the catch block should be from Child to Parent but should not be from Parent to Child.
*/
class ExceptionHandlingEx17{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0); // ArithmeticException
		}
		catch(Exception e){
			System.out.println("Inside catch block. - 1");
			System.out.println(e);
		}
		catch(ArithmeticException ae){ // error: exception ArithmeticException has already been caught
			System.out.println("Inside catch block. - 2");
			System.out.println(ae);
		}
	    
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
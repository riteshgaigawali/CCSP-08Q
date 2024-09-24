/*
- Exception Propogation :- If an exception is raised it will be caught by an immediate catch block, however if an immediate catch block did not match the type of an exception then it will look for the other catch block, and check whether other catch blocks are able to handle the exception or not, if it is matching then respective catch block will get executed or else the program will get terminated abnormally.

- The above process is known as Exception Propogation.

*/
class ExceptionHandlingEx16{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside try block.");
			System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
		}
	    catch(ArithmeticException ae){ // immediate catch block --> exception will be propogated to next catch block
			System.out.println("Inside catch block. - 1");
			System.out.println(ae);
		}
	    catch(Exception ai){ 
			System.out.println("Inside catch block. - 2");
			System.out.println(ai);
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
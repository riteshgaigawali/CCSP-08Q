/*
- Whenever an exception is raised the immediate catch block gets executed.
- Duplicate catch blocks are not allowed in Java.
*/
class ExceptionHandlingEx15{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside try block.");
			System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
		}
	    catch(ArrayIndexOutOfBoundsException ai){ // immediate catch block
			System.out.println("Inside catch block. - 1");
			System.out.println(ai);
		}
	    catch(ArrayIndexOutOfBoundsException ai){ //error: exception ArrayIndexOutOfBoundsException has already been caught
			System.out.println("Inside catch block. - 2");
			System.out.println(ai);
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
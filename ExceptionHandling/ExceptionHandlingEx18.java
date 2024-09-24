/*
- Assignment question :- Nested try-catch blocks.
*/
class ExceptionHandlingEx18{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside outer try block.");
			
			try{
				System.out.println("Inside inner try block. - 1");
				System.out.println(10/0); 
			}
			catch(ArithmeticException ae){ 
			System.out.println("Inside inner catch block. - 1");
			}
			
			System.out.println(arr[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Inside outer catch block.");
			
			try{
				System.out.println("Inside inner try block. - 2");
				System.out.println(10/0); 
			}
			catch(ArithmeticException ae){ 
			System.out.println("Inside inner catch block. - 2");
			}
			
		}
	
		System.out.println("Stop @Cyber Success");
	}
}
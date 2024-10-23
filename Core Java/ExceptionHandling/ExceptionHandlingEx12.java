/*
- In the try block of any point of time it can raise only one exception at a time which could be of any type.
- But at any point of time it can only raise one exception.
- We can have try block followed by one or multiple catch blocks in the program.

*/
class ExceptionHandlingEx12{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};

		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);// ArithmeticException
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Inside catch block. - 1");
			System.out.println(ai);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block. - 2");
			System.out.println(ae);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
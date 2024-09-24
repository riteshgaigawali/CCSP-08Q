/*
- Problem :- If two exception are raised in the try block then correspondingly we will have to use two catch blocks, similarly if there are 50 exceptions in the try block we will have to use 50 catch blocks.
However all catch blocks will never get executed only one catch block will get executed, due to this 49 blocks will never get executed.
But the 49 blocks will increase the length of the code and cosume memory and will have impact on the execution. Hence to overcome this problem the solution is as follows :

- Solution :- The solution to the above problem is, every Child exception object can be upcasted to the parent object, due to which any Child exception can be handled with the help of 'Exception' class using only one catch block.
Hence there will be no need to write multiple catch blocks and eventually we can reduce our code length to only one catch block as well as memory usage is efficient.

*/
class ExceptionHandlingEx13{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside try block.");
			System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
			System.out.println(10/0); // ArithmeticException
		}
	    catch(Exception e){
			System.out.println("Inside catch block.");
			System.out.println(e);// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
/*

- We can also use Throwable class to upcast Child exception objects other than Exception class.

*/
class ExceptionHandlingEx14{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("Inside try block.");
			System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
			System.out.println(10/0); // ArithmeticException
		}
	    catch(Throwable t){
			System.out.println("Inside catch block.");
			System.out.println(t);// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Give an example on unchecked exception ?
>> 1) java.lang.ArithmeticException
   2) java.lang.ArrayIndexOutOfBoundsException
   
*/
class ExceptionHandlingEx02{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int arr[] = {10, 20, 30, 40, 50};
		
		System.out.println(arr[50]);// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 50 out of bounds for length 5
		
		System.out.println("Stop @Cyber Success");
	}
}
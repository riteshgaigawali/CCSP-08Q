/*
		3. Errors
		
- Error in real-time cannot be handled like exceptions, we have to go and fix them.

*/
class ExceptionHandlingEx39{
		public static void main(String args[]){
			System.out.println("Start @Cyber Success");
			
			int[] arr = new int[1000000000]; //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space 
			
			System.out.println("Stop @Cyber Success");
		}
}
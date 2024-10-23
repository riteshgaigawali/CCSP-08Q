/*
- The reference variable of an exception will print the exception info, because the Throwable class overrides the toString() method of Object class and prints the info of an exception instead of the address of an object like normal class reference variable.
- The toString() method is overriden within the Throwable class, which is root class of all the Exception classes.
*/
class ExceptionHandlingEx11{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0); // ArithmeticException
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(ae);// java.lang.ArithmeticException: / by zero
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
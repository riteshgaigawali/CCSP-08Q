/*
- One method is able to throw multiple exceptions at a time while using throws keyword.
*/
class ExceptionHandlingEx33{
	
	static void test() throws InterruptedException, ArithmeticException{
		System.out.println("Inside test method.");
		Thread.sleep(3000);// Checked exception will be deligated and handled by JVM.
		/*System.out.println(10/0);  Unchecked exception will be deligated but not handled by JVM.
		
									 Exception in thread "main" java.lang.ArithmeticException: / by zero
												 at ExceptionHandlingEx33.test(ExceptionHandlingEx33.java:9)
												 at ExceptionHandlingEx33.main(ExceptionHandlingEx33.java:15)
								*/
	}
	
	public static void main(String args[]) throws InterruptedException, ArithmeticException{
		System.out.println("Start @Cyber Success");
		
		test();
		
		System.out.println("Stop @Cyber Success");
	}
}
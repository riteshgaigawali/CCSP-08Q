/*
- Which is the default method called by JVM to print exceptions info ?
>> printStackTrace() method is the default method called to print exceptions info in by the JVM.
*/
class ExceptionHandlingEx30{
	
	static void m3(){
		System.out.println("Inside m3 method.");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(ae.toString());// java.lang.ArithmeticException: / by zero
			System.out.println(ae.getMessage());// / by zero
			ae.printStackTrace();/* java.lang.ArithmeticException: / by zero
										at ExceptionHandlingEx30.m3(ExceptionHandlingEx30.java:12)
										at ExceptionHandlingEx30.m2(ExceptionHandlingEx30.java:26)
										at ExceptionHandlingEx30.m1(ExceptionHandlingEx30.java:30)
										at ExceptionHandlingEx30.main(ExceptionHandlingEx30.java:36) */
		}
		
	}
	static void m2(){
		System.out.println("Inside m2 method.");
		m3();
	}
	static void m1(){
		System.out.println("Inside m1 method.");
		m2();
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
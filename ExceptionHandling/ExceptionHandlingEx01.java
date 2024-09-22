/*
What are Exceptions ?
>> In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions.

What are differnt type of Exceptions ?
>> There are mainly three types of Exceptions :
1) Unchecked Exceptions
2) Checked Exceptions
3) Errors

1. What are Unchecked Exceptions :

- In an unchecked exceptions the compiler doesn't find the exception but the JVM finds an exception such an exceptions are called as Unchecked Exceptions.

- In an unchecked exceptions the program will get compiled but will not get fully executed. 

*/
class ExceptionHandlingEx01{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		System.out.println(10/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println("Stop @Cyber Success");
	}
}
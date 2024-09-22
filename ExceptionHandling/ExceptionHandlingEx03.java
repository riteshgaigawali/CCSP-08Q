/*
2. What are Checked Exceptions ?
>> Checked Exceptions means the compiler finds an exception.

- In checked exceptions can a program get compiled or not ?
>> No, in the checked exceptions the program will never get compiled, because the compiler throws an exception/error and the program never gets compiled.

- What are Native Methods in Java ?
>> In Java a Native Method is a method whose implementation is written in a language other than Java like C/C++. These methods are used to interact with the system specific libraries that can't be accessed directly using Java.

- Give an example of Checked Exception.
>> java.lang.InterruptedException

- What do you mean by fully-checked and partially checked exceptions ?
>> 1) Fully-checked Exceptions :- If an exception is checked and all it's Child classes are checked then, such an exceptions are called as Fully-checked Exceptions. Ex. IOException
2) Partially-checked Exceptions :- If an exception is checked and some of it's Child classes are unchecked, then such an exceptions are called as Partially-checked Exceptions. Ex. Exception, Throwable

*/
class ExceptionHandling03{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// error: unreported exception InterruptedException; must be caught or declared to be thrown
		Thread.sleep(3000);// miliseconds (3 sec)
		
		System.out.println("Stop @Cyber Success");
	}
}
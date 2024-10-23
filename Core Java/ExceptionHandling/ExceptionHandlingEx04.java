/*
 Exception Handling :
 
What do you mean by exception handling ?
>> The exception handling is the process which will ensure two things :
1) The program will have a normal termination.
2) The remaining statements in the program will get executed.

What steps will you take to handle an exception ?
>> There are two approaches to handle an exception :-
1) Using try-catch block
2) Using 'throws' keyword

- To handle an exception one of the first approach is : Using the try-catch block.

- Syntax : try{
	
				}
			catch(Exception e){
				
			}

- In the try block we write statements that may raise an exception.

- In the catch block we can write the statements which provides an alternate solution to an exception.

- If an exception is raised in the try block in the catch block we have to catch same type of exception.

- Note :- Exceptions are treated/represented in the form of classes.

- When an exception is raised means internally it will create an object of a particular exception class and the address of an object will be stored in the reference variable passed as parameter to the catch block.

*/
class ExceptionHandlingEx04{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);// ArithmeticException
		}
		catch(ArithmeticException ae){
			System.out.println("Inside catch block.");
			System.out.println(10/2);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
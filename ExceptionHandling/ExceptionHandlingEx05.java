/*
- If an exception is raised of one type (eg. ArithmeticException) and it is handled/caught with the another type (eg. ArrayIndexOutOfBoundsException) then it leads to abnormal termination of program. 

- The program will get compiled but will never get fully executed, because the exceptions raised is unchecked. 

*/
class ExceptionHandlingEx05{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		try{
			System.out.println("Inside try block.");
			System.out.println(10/0);// ArithmeticException raised
		}
		catch(ArrayIndexOutOfBoundsException ai){ // ArrayIndexOutOfBoundsException handled/caught
			System.out.println("Inside catch block.");
			System.out.println(ai);
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
    * Custom Exceptions :
	
- Custom exceptions can be categorized mainly into two types :
1) User-defined Checked Exceptions - 0 args, parameterized
2) User-defined Uncheked Exceptions - 0 args, parameterized

1. User-defined Checked Exceptions can be categorized mainly into two types:
				1) 0 args Constructor based exceptions
				2) parameterized Constructor based exceptions

- In user-defined Checked Exceptions the program will never get compiled as the Checked Exceptions are raised by the compiler.

*/
class Hdfc{
	
	int accountBalance;
	
	Hdfc(int accountBalance){
		this.accountBalance = accountBalance; 
	}
	
	void transferAmount(int amount){
		if(amount <= accountBalance){
			System.out.println("Amount transfer successfull.");
		}else{
			System.out.println("Insufficient amount in account.");
			throw new AmountTransferException();
			//error: unreported exception AmountTransferException; must be caught or declared to be thrown
		}
	}
}
class ExceptionHandlingEx35{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Hdfc cust1 = new Hdfc(5000);
		cust1.transferAmount(7000);
		
		System.out.println("Stop @Cyber Success");
	}
}
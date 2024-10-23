/*
- Another example on User-defined Checked Exception with parameterised constructor to print custom messages.
*/
class Hdfc{
	
	int accountBalance;
	
	Hdfc(int accountBalance){
		this.accountBalance = accountBalance; 
	}
	
	void transferAmount(int amount) throws AmountTransferException{
		if(amount <= accountBalance){
			System.out.println("Amount transfer successfull.");
		}else{
			throw new AmountTransferException("Insufficient amount in account.");
			//Exception in thread "main" AmountTransferException: Insufficient amount in account.
			}
	}
}
class ExceptionHandlingEx36{
	public static void main(String args[]) throws AmountTransferException{
		System.out.println("Start @Cyber Success");
		Hdfc cust1 = new Hdfc(5000);
		cust1.transferAmount(7000); //Exception in thread "main" AmountTransferException: Insufficient amount in account.
		System.out.println("Stop @Cyber Success");
	}
}
/*
 Output :
 
		Start @Cyber Success
		Exception in thread "main" AmountTransferException: Insufficient amount in account.
											at Hdfc.transferAmount(ExceptionHandlingEx36.java:16)
											at ExceptionHandlingEx36.main(ExceptionHandlingEx36.java:25)

*/

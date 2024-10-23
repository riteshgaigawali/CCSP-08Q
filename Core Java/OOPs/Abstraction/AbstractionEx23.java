/*
- A class can extend one class but can implement multiple interfaces.
- The above concept is only applicable if we are using extends keyword first and then implements.
*/
interface JingBankAccount{
	void bankAccount();
}
interface JingBankLoan{
	void bankLoan();
}
class PreconditionIdProof{
	void idProof(){
		System.out.println("Aadhar/PAN details are complete. - PreconditionIdProof");
	}
}

/*
error: '{' expected
class Customer implements JingBankAccount, JingBankLoan extends PreconditionIdProof{
*/
class Customer extends PreconditionIdProof implements JingBankAccount, JingBankLoan{
	public void bankAccount(){
		System.out.println("Apply for saving bank account. - Customer");
	}
	public void bankLoan(){
		System.out.println("Apply for personal loan. - Customer");
	}
}
class AbstractionEx23{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Customer cust1 = new Customer();
		cust1.idProof(); cust1.bankAccount(); cust1.bankLoan();
		
		System.out.println("Stop @Cyber Success");
	}
}  
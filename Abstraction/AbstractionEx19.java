/*
- Real-time implementation example of abstraction using interfaces.
*/
interface HdfcBankAcc{
	void bankAccount();
}
interface HdfcBankLoan extends HdfcBankAcc{
	void bankLoan();
}
class Customer1 implements HdfcBankAcc{
	public void bankAccount(){
		System.out.println("Inside bankAccount method. - Savings account - Customer1");
	}
}
class Customer2 implements HdfcBankLoan{
	public void bankAccount(){
		System.out.println("Inside bankAccount method. - Loan account - Customer2");
	}
	public void bankLoan(){
		System.out.println("Inside bankLoan method. - Customer2");
	}
}
class AbstractionEx19{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Customer1 cust1Ref1 = new Customer1();
		cust1Ref1.bankAccount(); //cust1Ref1.bankLoan(); error: cannot find symbol
		
		HdfcBankAcc cust1Ref2 = new Customer1();
		cust1Ref2.bankAccount(); //cust1Ref2.bankLoan(); error: cannot find symbol
		
		System.out.println(" --------------------------------------------");
		
		Customer2 cust2Ref1 = new Customer2();
		cust2Ref1.bankAccount(); cust2Ref1.bankLoan();
		
		HdfcBankLoan cust2Ref2 = new Customer2();
		cust2Ref2.bankAccount(); cust2Ref2.bankLoan();
		
		System.out.println("Stop @Cyber Success");
	}
}
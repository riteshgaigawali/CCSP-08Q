/*
- Multiple inheritance is not supported at class level but it is supported at interface level.
*/
interface IciciBankAcc {
	void bankAccount();
}
interface IciciLoans{
	void bankLoan();
}
interface IciciFreeInsurance extends IciciBankAcc, IciciLoans{
	void freeInsurance();
}
class Customer1 implements IciciFreeInsurance{
	public void bankAccount(){
		System.out.println("Inside bankAccount method. - Customer1");
	}
	public void bankLoan(){
		System.out.println("Inside bankLoan method. - Customer1");
	}
	public void freeInsurance(){
		System.out.println("Inside freeInsurance method. - Customer1");
	}
}
class AbstractionEx20{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Customer1 cust1 = new Customer1();
		cust1.bankAccount(); cust1.bankLoan(); cust1.freeInsurance();
		
		System.out.println(" -------------------------------------------");
		
		IciciFreeInsurance cust2 = new Customer1();
		cust2.bankAccount(); cust2.bankLoan(); cust2.freeInsurance();
		
		
		System.out.println("Stop @Cyber Success");
	}
}
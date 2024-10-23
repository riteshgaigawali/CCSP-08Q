//Business logic class
class Hdfc{
int accountBal;
String custName;
static
{
System.out.println("Logics to verify adhar/pan details of citizen.");
}
{
	System.out.println("Verify by generating OTP, and confirm citizenship.");
}
Hdfc(String custName, int amountDeposit){
if(amountDeposit >= 10000){
	System.out.println("Account created successfuly for "+custName);
	this.custName = custName;
	this.accountBal = this.accountBal + amountDeposit;
}else{
	System.out.println("Invalid amount.");
}
}
//getter
void getAccountBal(){
	System.out.println("Account balance of customer :- "+custName+ " is "+accountBal);
}
//setter
void setAccountBal(int amountDeposit){
	this.accountBal = this.accountBal + amountDeposit;
	System.out.println("Updated account balance of customer :- "+custName+ " is "+accountBal);
}

}
//Controler class
class StaticBlock1{
	
	public static void main(String args[]){
	
	System.out.println("Start @Cyber Success");
	
	Hdfc cust1 = new Hdfc("Ritesh", 90000);
	cust1.getAccountBal();
	cust1.setAccountBal(1000);
	
	System.out.println("Stop @Cyber Success");
	}
}
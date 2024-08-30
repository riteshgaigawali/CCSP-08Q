class Swiggy{
void payment(){
System.out.println("Payment through cash.");
}
void payment(int debitCredit){
System.out.println("Payment through debit/credit card. "+debitCredit);
}
void payment(String upi){
System.out.println("Payment through upi. "+upi);
}
void payment(char netBanking){
System.out.println("Payment through netBanking. "+netBanking);
}
}
class OverloadingEx2{
	public static void main(String args[]){
System.out.println("Start @Cyber Success");
Swiggy cust1 = new Swiggy();
cust1.payment("9359903015@ybl");
System.out.println("Stop @Cyber Success");
	}
}
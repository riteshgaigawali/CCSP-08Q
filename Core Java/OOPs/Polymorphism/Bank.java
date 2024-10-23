/*
Practical implementation of polymorphism through overriding.
*/
class RBI{
	
	void loan(){ System.out.println("Min ROI @ 8% - RBI");}
	final void accCharges(){ System.out.println("Min Acc Charges @ 1% - RBI");}
}
class HDFC extends RBI{
	
	//void loan(){ System.out.println("Min ROI @15% - HDFC");}
	//void accCharges(){System.out.println("Min acc Charges @5.6% - HDFC");} 
	//error: accCharges() in HDFC cannot override accCharges() in RBI
	
}
class ICICI extends RBI{
	void loan(){System.out.println("Min ROI @ 14.5% - ICICI");}
	//void accCharges(){System.out.println("Min acc Charges @4% - ICICI");}
	//error: accCharges() in HDFC cannot override accCharges() in RBI
}
class YESBank extends RBI{
	
	void loan(){System.out.println("Min ROI @9% - YESBank");}
	//void accCharges(){System.out.println("Min acc Charges @3% - YESBank");}
}

class Bank{
public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	
	RBI cust1 = new ICICI();
	cust1.loan();
	cust1.accCharges();
	
	System.out.println(" -------------------------------- ");
	RBI cust2 = new YESBank();
	cust2.loan();
	cust2.accCharges();
	
	System.out.println(" -------------------------------- ");
	RBI cust3 = new HDFC();
	cust3.loan();
	cust3.accCharges();
	
	System.out.println("Stop @Cyber Success");
}
}
class Combo7{
 
 boolean status = true;
 void m1(){
	 System.out.println("Inside m1 method...");
 }

public static void main(String args[]){
	
	System.out.println("Start @Cyber Success");
	
	Combo7 combo = new Combo7();
	combo.test();
		System.out.println("Start @Cyber Success");
}
void test(){
	
	//Direct access
	System.out.println(status);
	m1();
	
	// By creating object
	Combo7 combo = new Combo7();
	System.out.println(combo.status);
	combo.m1();
}

}
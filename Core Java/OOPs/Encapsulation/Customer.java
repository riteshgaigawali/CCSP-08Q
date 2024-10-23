/*
- The very widely used class under encapsulation is called as the Java Bean Class.
- JavaBeans are classes that encapsulate many objects into a single object (the bean). It is a Java class that should follow the following conventions:

1. Must implement Serializable.
2. It should have a public no-arg constructor.
3. All properties in java bean must be private with public getters and setter methods.

- A JavaBeans class can also be called as value object class, business object class, or data transfer object class.

*/
class Hdfc{
	
	private int amount;
	Hdfc(int amount){
		if(amount >= 10000){
			this.amount = this.amount + amount;
			System.out.println("Account is successfuly created.");
		}else{
			System.out.println("Amount is insufficient, please try again.");
		}
	}
	
	public void setAmount(int amount){ this.amount = this.amount + amount; }
	public int getAmount(){ return amount; }
}
class Customer{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Hdfc cust1 = new Hdfc(10000);
		int accountBal = cust1.getAmount();
		System.out.println("The account balance is : "+accountBal);
		cust1.setAmount(5000);
		accountBal = cust1.getAmount();
		System.out.println("The account balance is : "+accountBal);
		
		System.out.println("Stop @Cyber Success");
	}
}
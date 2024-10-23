/*
- Another example of user-defined Unchecked Exceptions, with parameterised constructor and custom exception information.
*/
class Flipkart{
	int mobileStock = 3;
	String custName;
	
	Flipkart(String custName){
		this.custName = custName;
		System.out.println(custName +", Welcome to Flipkart !");
	}
	
	void buyFlipkartItem(int quantity){
		if(mobileStock >= quantity){
			mobileStock = mobileStock - quantity;
		    System.out.println("Item added to the cart.");
		}else{
			throw new OutOfStockException("This item is OutOfStock"); 
		}
		
	}
}
class ExceptionHandlingEx38{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Flipkart cust1 = new Flipkart("Ritesh");
		cust1.buyFlipkartItem(3);// Item added to the cart.
		cust1.buyFlipkartItem(2);
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
Output :

	Start @Cyber Success
	Ritesh, Welcome to Flipkart !
	Item added to the cart.
	Exception in thread "main" OutOfStockException: This item is OutOfStock
			at Flipkart.buyFlipkartItem(ExceptionHandlingEx38.java:18)
			at ExceptionHandlingEx38.main(ExceptionHandlingEx38.java:29)

*/
/*
1. User-defined Unchecked Exceptions can be categorized mainly into two types:
				1) 0 args Constructor based exceptions
				2) parameterized Constructor based exceptions
				
- In user-defined Unchecked Exceptions the program will get compiled but will not fully execute as the Unchecked Exceptions are raised by the JVM, which will lead the program to abnormal termination.

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
			throw new OutOfStockException(); //Flipkart.buyFlipkartItem(ExceptionHandlingEx37.java:23)
		}
		
	}
}
class ExceptionHandlingEx37{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Flipkart cust1 = new Flipkart("Ritesh");
		cust1.buyFlipkartItem(3);// Item added to the cart.
		cust1.buyFlipkartItem(2);// ExceptionHandlingEx37.main(ExceptionHandlingEx37.java:34)
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
Output :

		Start @Cyber Success
		Ritesh, Welcome to Flipkart !
		Item added to the cart.
		Exception in thread "main" OutOfStockException
				at Flipkart.buyFlipkartItem(ExceptionHandlingEx37.java:23)
				at ExceptionHandlingEx37.main(ExceptionHandlingEx37.java:34)
*/
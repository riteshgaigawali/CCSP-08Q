/*
- The classes that provide empty implementation to the interface methods such classes are called as Adapter Classes.
*/
interface Hsbc{
	void mutualFunds();
	void capitalMarkets();
	void forexTrading();
}
//Adapter class
class HsbcImpl implements Hsbc{
	public void mutualFunds(){}
	public void capitalMarkets(){}
	public void forexTrading(){}
}
class HsbcMF extends HsbcImpl{
	
	@Override
	public void mutualFunds(){
		System.out.println("Inside mutualFunds method. - HsbcMF");
	}
}
class AbstractionEx25{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		HsbcMF ref = new HsbcMF();
		ref.mutualFunds();
		
		
		System.out.println("Stop @Cyber Success");
	}
}
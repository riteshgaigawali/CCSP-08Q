/*

1. Class extends Class
2. Class extends AbstractClass
3. AbstractClass extends AbstractClass
4. Interface extends Interface
-------------------------------------------
1. Class implements Interface
2. AbstractClass implements Interface

- Real-time implementation example of abstraction using interfaces and abstract classes.
*/
interface Boa{
	
	void banking();
	void insurance();
	void finance();
}
abstract class WiproBoaBanking implements Boa{
	
	public void banking(){
		System.out.println("Inside banking method. - WiproBoaBanking");
	}
}
abstract class WiproBoaInsurance extends WiproBoaBanking{
	
	public void insurance(){
		System.out.println("Inside insurance method. - WiproBoaInsurance");
	}
}
class WiproBoaFinance extends WiproBoaInsurance{
	
	public void finance(){
		System.out.println("Inside finance method. - WiproBoaFinance");
	}
}
class AbstractionEx18{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Inheritance
		WiproBoaFinance wbf = new WiproBoaFinance();
		wbf.finance(); wbf.banking(); wbf.insurance(); 
		
		System.out.println(" --------------------------------- ");
		
		//Polymorphism
		WiproBoaBanking wbb = new WiproBoaFinance();
		wbb.banking(); wbb.insurance(); wbb.finance();
		
		System.out.println(" --------------------------------- ");
		
		//Polymorphism
		WiproBoaInsurance wbi = new WiproBoaFinance();
		wbi.insurance(); wbi.banking(); wbi.finance();
		
		System.out.println(" --------------------------------- ");
		
		//Abstraction
		Boa cust1 = new WiproBoaFinance();
		cust1.banking(); cust1.insurance(); cust1.finance();
	
		System.out.println("Stop @Cyber Success");
	}
}
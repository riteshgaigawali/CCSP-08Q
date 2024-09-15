/*
- We can create variables within an interface.
- A variable within an interface is public, static and final.
*/
interface Interface1{
	int a = 100;
}
class AbstractionEx24 implements Interface1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		System.out.println(a);
		
		System.out.println("Stop @Cyber Success");
	}
}
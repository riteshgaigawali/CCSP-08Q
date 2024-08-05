class StaticVar1{
	
	static int a=100;
	
public static void main(String args[]){
	System.out.println(a); //Direct access
	System.out.println(StaticVar1.a); //Using className
	// by creating object -> valid
}
}
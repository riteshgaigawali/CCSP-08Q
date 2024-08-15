class StaticRefVar1{
boolean x = true;
void m1(){
System.out.println("Inside m1 method...");
}
static StaticRefVar1 ref = new StaticRefVar1();
public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	//Direct access
	System.out.println(ref.x);
	ref.m1();
	System.out.println("Stop @Cyber Success");
}


}
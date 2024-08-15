class StaticRefVar2{
boolean x = true;
void m1(){
System.out.println("Inside m1 method...");
}
static StaticRefVar2 ref;
public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	ref = new StaticRefVar2();
	System.out.println(ref.x);
	ref.m1();
	System.out.println("Stop @Cyber Success");
}


}
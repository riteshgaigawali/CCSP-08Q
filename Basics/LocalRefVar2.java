class LocalRefVar2{
boolean x = true;
void test(){
	
	System.out.println("Inside test method...");
}
public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	LocalRefVar2 ref = new LocalRefVar2();
	m1(ref);
	System.out.println("Stop @Cyber Success");
}
static void m1(LocalRefVar2 ref){
	
	System.out.println("Inside m1 method...");
	System.out.println(ref.x);
	ref.test();
}

}
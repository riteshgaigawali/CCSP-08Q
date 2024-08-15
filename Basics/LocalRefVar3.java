class LocalRefVar3{
boolean x = true;
void test(){
	
	System.out.println("Inside test method...");
}
public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	LocalRefVar3 ref = m1();
	System.out.println(ref.x);
	ref.test();
	System.out.println("Stop @Cyber Success");
}
static LocalRefVar3 m1(){
	System.out.println("Inside m1 method...");
	LocalRefVar3 ref = new LocalRefVar3();
	return ref;
}

}
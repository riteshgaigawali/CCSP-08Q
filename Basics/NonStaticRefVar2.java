class Demo{
int a = 100;
void test(){
System.out.println("Inside test method...");
}
}
class NonStaticRefVar2{
Demo ref;

public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticRefVar2 ref1 = new NonStaticRefVar2();
ref1.ref = new Demo();
System.out.println(ref1.ref.a);
ref1.ref.test();
System.out.println("Stop @Cyber Success");
}
}
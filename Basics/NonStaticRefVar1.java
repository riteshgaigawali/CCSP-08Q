class NonStaticRefVar1{
int a = 100;
NonStaticRefVar1 ref;
public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticRefVar1 ref1 = new NonStaticRefVar1();
ref1.ref= new NonStaticRefVar1();
System.out.println(ref1.a);
System.out.println(ref1.ref.a);

ref1.a = 250;
ref1.ref.a = 500;

System.out.println(ref1.a);
System.out.println(ref1.ref.a);

System.out.println("Stop @Cyber Success");
}
}
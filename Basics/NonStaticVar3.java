class NonStaticVar3{
int a = 10;
float f = 20.5f;

public static void main(String args[]){

System.out.println("Start @Cyber Success");

NonStaticVar3 ref1 = new NonStaticVar3();
NonStaticVar3 ref2 = new NonStaticVar3();

System.out.println(ref1.a);
System.out.println(ref2.f);

ref1.a=100;
ref1.f=200.5f;

ref2.a=1000;
ref2.f=2000.5f;

System.out.println(ref1.a + ref1.f);
System.out.println(ref2.a + ref2.f);

System.out.println("Stop @Cyber Success");

}

}
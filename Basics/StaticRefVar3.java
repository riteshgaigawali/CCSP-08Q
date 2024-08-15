class Demo{

int a =100;
void m1(){
System.out.println("Inside m1 method...");

}

}
class StaticRefVar3{

static Demo demoRef = new Demo();

public static void main(String args[]){
System.out.println("Start @Cyber Success");
System.out.println(demoRef.a);
demoRef.m1();
System.out.println("Stop @Cyber Success");
}

}
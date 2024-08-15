class Demo1{
int a =100;
}
class Demo2{
void m1(){
System.out.println("Inside m1 method...");
}
}
class Sample{
static Demo1 demoRef1 = new Demo1();
static Demo2 demoRef2 = new Demo2();
}
class StaticRefVar5{

public static void main(String args[]){
System.out.println("Start @Cyber Success");
System.out.println(Sample.demoRef1.a);
Sample.demoRef2.m1();
System.out.println("Stop @Cyber Success");
}

}
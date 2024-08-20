class Demo{
int a = 100;
}
class Sample{
void m1(){
System.out.println("Inside m1 method...");
}
}
class Cyber{
Sample samp;
}
class Success{
Demo demo;
}
class NonStaticRefVar5{
public static void main(String args[]){

System.out.println("Start @Cyber Success");
NonStaticRefVar5 ref = new NonStaticRefVar5();
Cyber cyber = new Cyber();
cyber.samp = new Sample();
cyber.samp.m1();
Success suc = new Success();
suc.demo = new Demo();
System.out.println(suc.demo.a);
System.out.println("Stop @Cyber Success");
}
}
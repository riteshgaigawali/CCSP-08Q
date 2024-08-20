class Demo{
int a =100;
}
class Sample{
void m1(){
System.out.println("Inside m1...");
}
}
class NonStaticRefVar4{
Demo demo = new Demo();
Sample samp = new Sample();
public static void main(String args[]){
System.out.println("Start...");
NonStaticRefVar4 ref = new NonStaticRefVar4();
System.out.println(ref.demo.a);
ref.samp.m1();
}

}
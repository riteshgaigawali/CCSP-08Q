class Parent{
void m1(){
System.out.println("Inside m1 method.");
}
}
final class Child extends Parent{
void m2(){
System.out.println("Inside m2 method.");
}
}
class InheritanceEx8{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m2();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
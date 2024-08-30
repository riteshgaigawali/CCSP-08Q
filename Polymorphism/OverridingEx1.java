class Parent{
void m1(){
System.out.println("Inside m1 method. - Parent");
}
}
class Child extends Parent{
void m1(){
System.out.println("Inside m1 method. - Child");
}
}
class OverridingEx1{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
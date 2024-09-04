class Parent{
void m1(){
System.out.println("Inside 0 args m1 method. - Parent");
}
}
class Child extends Parent{
void m1(int a){
System.out.println("Inside 1 args m1 method. - Child "+a);
}
}
class PolymorphismEx09{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

Child c = new Child();
c.m1();
c.m1(10);

System.out.println("Stop @Cyber Success");
}
}
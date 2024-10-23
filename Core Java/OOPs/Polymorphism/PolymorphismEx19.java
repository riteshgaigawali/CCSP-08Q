class Parent{
void m1(){
System.out.println("Inside m1 method.");
}
}
class Child extends Parent{
void m2(){
System.out.println("Inside m2 method.");
}
}
class PolymorphismEx19{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
p.m1();
//p.m2(); --> CE

//Downcasting
Child c = (Child)p;
c.m1();
c.m2();

System.out.println("Stop @Cyber Success");
}
}
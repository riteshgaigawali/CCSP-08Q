/* Within an abstract class not only we can create incomplete methods (eg. abstract methods) but we can also create complete methods.
*/
abstract class Parent{

abstract void m1();

void m2(){
System.out.println("Inside m2 method. - Parent");
}

}
class Child extends Parent{

@Override
void m1(){
System.out.println("Inside m1 method. - Child");
}

}
class AbstractionEx06{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Inheritance
Child c = new Child();
c.m1(); c.m2();
System.out.println(" ------------------------------------- ");
//Polymorphic Behaviour
Parent p = new Child();
p.m1(); p.m2();

System.out.println("Stop @Cyber Success");
}
}
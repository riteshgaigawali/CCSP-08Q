/*
- An object can Upcast not only to the imediate parent but also to imediate grand-parent and so on.
- And the same way it can Downcast to parent and child.
*/
class GrandParent{
int a = 100;
void m1(){
System.out.println("Inside m1 method - GrandParent "+a);
}
}
class Parent extends GrandParent{
float b = 200.5f;
void m2(){
System.out.println("Inside m2 method - Parent "+b);
}
}
class Child extends Parent{
char c = 'X';
void m3(){
System.out.println("Inside m3 method - Child "+c);
}
}
class PolymorphismEx1{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
p.m1(); p.m2(); //gp.m3(); --> Invalid

System.out.println(" --------------------------- ");

//Upcasting
GrandParent gp = (GrandParent)p;
gp.m1(); //gp.m2(); gp.m3(); --> Invalid

System.out.println(" --------------------------- ");

//Upcasting
Child c = (Child)gp;
c.m1(); c.m2(); c.m3();


System.out.println("Stop @Cyber Success");
}

}
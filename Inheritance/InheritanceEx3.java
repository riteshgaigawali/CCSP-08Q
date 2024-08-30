//Multi-level Inheritance
class Parent{
int a = 100;
void m1(){
System.out.println("Inside m1 method. "+a);
}
}
class Child1 extends Parent{
float b = 20.5f;
void m2(){
System.out.println("Inside m2 method. "+b);
}
}
class Child2 extends Child1{
char c = 'a';
void m3(){
System.out.println("Inside m3 method. "+c);
}
}
class InheritanceEx3{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Parent
Parent p1 = new Parent();
System.out.println(p1.a); p1.m1();
// System.out.println(p1.b +" "+ p1.c); p1.m2(); p1.m3(); Error : this cannot be accessed using Parent class object.

Child1 c1 = new Child1();
System.out.println(c1.a); c1.m1();
System.out.println(c1.b); c1.m2();
//System.out.println(c1.c); c1.m3(); Error : this cannot be accessed using Parent class object.

Child2 c2 = new Child2();
System.out.println(c2.a); c2.m1();
System.out.println(c2.b); c2.m2();
System.out.println(c2.c); c2.m3();

System.out.println("Stop @Cyber Success");
}
}
//Hybrid Inheritance ---> Hierarchical + Single Inheritance
class Parent{
int a = 100;
void m1(){
System.out.println("Inside m1 method. "+a);
}
}
class ChildParent1 extends Parent{
float b = 20.5f;
void m2(){
System.out.println("Inside m2 method. "+b);
}
}
class ChildParent2 extends Parent{
char c = 'a';
void m3(){
System.out.println("Inside m3 method. "+c);
}
} //Hierarchical Inheritance
class Child3 extends ChildParent1{
boolean flag = true;
void m4(){
System.out.println("Inside m4 method. "+flag);
}
} //Single Inheritance
class Child4 extends ChildParent2{
int i = 500;
void m5(){
System.out.println("Inside m5 method. "+i);
}
} //Single Inheritance
class InheritanceEx6{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Parent
Parent p1 = new Parent();
System.out.println(p1.a); p1.m1();

//ChildParent1
ChildParent1 c1 = new ChildParent1();
System.out.println(c1.b); c1.m2();
System.out.println(c1.a); c1.m1(); 

//ChildParent2
ChildParent2 c2 = new ChildParent2();
System.out.println(c2.c); c2.m3();
System.out.println(c2.a); c2.m1();

//Child3
Child3 c3 = new Child3();
System.out.println(c3.flag); c3.m4();
System.out.println(c3.a); c3.m2();

//Child4
Child4 c4 = new Child4();
System.out.println(c4.i); c4.m5();
System.out.println(c4.a); c4.m3();

System.out.println("Stop @Cyber Success");
}
}
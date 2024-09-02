/*
Under the concept of Overloading with more than two classes it is possible to perform Upcasting and Downcasting.
*/

class Parent{
void m1(){
System.out.println("Inside m1 method - 0 args");
}
}
class Child extends Parent{
void m1(int a){
System.out.println("Inside m1 method - 1 args");
}
}
class OverridingEx11{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
p.m1(); //p.m1(10); --> Invalid

System.out.println("Stop @Cyber Success");
}
}
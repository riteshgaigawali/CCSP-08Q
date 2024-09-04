/*
Explain method hidding ?
--> If the methods in the parent and child are having the same signature and by nature are static such concept is called as method hidding.
Note : The child method gets hidden and the preference is given to the parent method.
*/

class Parent{
static void m1(){
System.out.println("Inside m1 method. - Parent");
}
}
class Child extends Parent{
static void m1(){
System.out.println("Inside m1 method. - Child");
}
}
class PolymorphismEx27{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p= new Child();
p.m1();



System.out.println("Stop @Cyber Success");
}
}

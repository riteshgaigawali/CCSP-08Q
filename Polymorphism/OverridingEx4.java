class Cyber{}
//Overriden class
class Parent{
Cyber m1(){
System.out.println("Inside m1 method - return Cyber - Parent");
return new Cyber();
}
}
//Overriding class
class Child extends Parent{
Cyber m1(){
System.out.println("Inside m1 method - return Cyber - Child");
return new Cyber();
}
}
class OverridingEx4{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
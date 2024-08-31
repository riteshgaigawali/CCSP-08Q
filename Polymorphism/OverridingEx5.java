class Cyber{}
class Success extends Cyber{}

//Overriden class
class Parent{
Cyber m1(){
System.out.println("Inside m1 method - return Cyber - Parent");
return new Cyber();
}
}
//Overriding class
class Child extends Parent{
Success m1(){
System.out.println("Inside m1 method - return Success - Child");
return new Success();
}
}
class OverridingEx5{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
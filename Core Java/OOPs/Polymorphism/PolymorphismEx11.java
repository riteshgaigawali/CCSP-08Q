//Overriden class
class Parent{
int m1(){
System.out.println("Inside m1 method which return 10. - Parent");
return 10;
}
}
//Overriding class
class Child extends Parent{
int m1(){
System.out.println("Inside m1 method which return 100. - Child");
return 100;
}
}
class PolymorphismEx11{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
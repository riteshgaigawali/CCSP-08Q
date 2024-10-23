//Overriden class
class Parent{
int m1(){
System.out.println("Inside m1 method which return 10. - Parent");
return 10;
}
}
//Overriding class
class Child extends Parent{
//error: m1() in Child cannot override m1() in Parent
//return type float is not compatible with int
float m1(){
System.out.println("Inside m1 method which return 100.5 - Child");
return 100.5f;
}
}
class PolymorphismEx12{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1();
System.out.println("Stop @Cyber Success");
}
}
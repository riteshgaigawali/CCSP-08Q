/*
This Example is not the concept of overriding, hence it is possible to perform Upcasting and Downcasting here.
*/

class Parent{
void carKeys(){
System.out.println("Car Keys - Parent");
}
}
class Child extends Parent{
void bikeKeys(){
System.out.println("Bike Keys - Child");
}
}
class PolymorphismEx23{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
p.carKeys(); //p.bikeKeys(); --> Invalid

//Downcasting
Child c = (Child)p;
c.bikeKeys(); c.carKeys();

System.out.println("Stop @Cyber Success");
}
}
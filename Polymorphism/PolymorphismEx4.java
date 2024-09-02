/*
- Under the concept of Overriding we cannot perform Upcasting and Downcasting.
- As in following Example the Upcasted 'p' object as well as Downcasted 'c' calls the same method homeKeys() which is inside Child; So there is no use of Upcasting and Downcasting.
*/

class Parent{
void homeKeys(){
System.out.println("Home keys - Parent");
}
}
class Child extends Parent{
void homeKeys(){
System.out.println("Home keys - Child");
}
}
class PolymorphismEx4{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
p.homeKeys();

System.out.println(" ---------------------------- ");

//Downcasting
Child c = (Child)p;
c.homeKeys(); c.homeKeys();

System.out.println("Stop @Cyber Success");
}
}
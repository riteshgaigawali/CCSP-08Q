/*
- As in following Example the Upcasted 'p' object as well as Downcasted 'c' calls the same method homeKeys() which is inside Parent, if there is no same method present in Child class.
*/

class Parent{
void homeKeys(){
System.out.println("Home keys - Parent");
}
}
class Child extends Parent{

}
class PolymorphismEx25{
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
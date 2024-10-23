//Correct way to implement overriding.
class Parent{
int a = 100;
}
class Child extends Parent{
float b = 200.5f;
}
class PolymorphismEx17{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
Parent p = new Child();
System.out.println(p.a);
// System.out.println(p.b);  error: cannot find symbol

//Downcasting
Child c = (Child)p;
System.out.println(c.a);
System.out.println(c.b);

System.out.println("Stop @Cyber Success");
}
}
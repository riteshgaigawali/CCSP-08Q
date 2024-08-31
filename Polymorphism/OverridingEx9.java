class Parent{
int a = 100;
}
class Child extends Parent{
float b = 200.5f;
}
class OverridingEx9{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Downcasting --> Direct downcasting is not allowed in Java
Child c = new Parent(); // error: incompatible types: Parent cannot be converted to Child

System.out.println("Stop @Cyber Success");
}
}
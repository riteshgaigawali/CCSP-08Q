class Parent{
{
System.out.println("Inside non-static/instance block. - Parent");
}
}
class Child extends Parent{
{
System.out.println("Inside non-static/instance block. - Child");
}
}
class InheritanceEx19{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
System.out.println("Stop @Cyber Success");
}
}
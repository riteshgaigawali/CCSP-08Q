class Parent{
static void cyber(){
System.out.println("Inside cyber method. - Parent");
}
}
class Child extends Parent{
static void success(){
System.out.println("Inside success method. - Child");
}
}
class InheritanceEx10{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Parent.cyber();
Child.success();
Child.cyber();
System.out.println("Stop @Cyber Success");
}
}
class Demo{
static void cyber(){
System.out.println("Inside cyber method. - Parent");
}
}
class Sample extends Demo{
static void success(){
System.out.println("Inside success method. - Child");
}
}
class InheritanceEx11{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Demo.cyber();
Sample.success();
Sample.cyber();

Parent obj = new Parent(); 
System.out.println(obj.getClass());

System.out.println("Stop @Cyber Success");
}
}
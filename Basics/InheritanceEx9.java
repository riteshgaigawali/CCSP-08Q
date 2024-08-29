class Parent{
int a = 1000;
float b = 2000.5f;
}
class Child extends Parent{
int p = 100;
float q = 200.5f;
void m1(int x, float y){
System.out.println("Inside m1 method.");
System.out.println(x+y);
System.out.println(p+q);
System.out.println(a+b);
}
}
class InheritanceEx9{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
c.m1(10,20.5f);
System.out.println("Stop @Cyber Success");
}

}
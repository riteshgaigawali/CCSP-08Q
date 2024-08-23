//When to use static keyword ? --> When we have to maintain unique data for each instance/object.

class StaticKeyword{

static int a;
float b;

public static void main(String args[]){
System.out.println("Start @Cyber Success");

StaticKeyword obj1 = new StaticKeyword();
System.out.println(obj1.a);
System.out.println(obj1.b);
obj1.a = 100;
obj1.b = 20.5f;
System.out.println(obj1.a);
System.out.println(obj1.b);

StaticKeyword obj2 = new StaticKeyword();
System.out.println(obj2.a);
System.out.println(obj2.b);
obj2.a = 150;
obj2.b = 30.5f;
System.out.println(obj2.a);
System.out.println(obj2.b);

System.out.println(obj1.a);
System.out.println(obj2.b);

System.out.println(obj2.a);
System.out.println(obj1.b);


System.out.println("Stop @Cyber Success");
}

}
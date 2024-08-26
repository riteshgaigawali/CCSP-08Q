class Demo{
static int a = 100;

static
{
System.out.println("Inside static block. - Demo");
}

}
class StaticBlock7{
static
{
System.out.println("Inside static block. - StaticBlock7");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
System.out.println(Demo.a);
System.out.println("Stop @Cyber Success");
}

}
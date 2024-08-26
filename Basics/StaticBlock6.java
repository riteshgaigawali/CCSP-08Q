class StaticBlock6{

static int a;

static
{
System.out.println("Inside static block. "+a);//0
a = 10;
}
static void m1(){
System.out.println("Inside m1 mehtod. "+a);//10
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
m1();
System.out.println("Stop @Cyber Success");
}

}
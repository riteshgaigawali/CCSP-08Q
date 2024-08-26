class NonStaticBlock7{
int a;
{
System.out.println("Inside non-static block. "+a);//0
a = 10;
}
NonStaticBlock7(){
System.out.println("Inside 0 args constructor. "+a);
a = 20;
}
void m1(){
System.out.println("Inside 1 args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
new NonStaticBlock7().m1();
System.out.println("Stop @Cyber Success");
}
}
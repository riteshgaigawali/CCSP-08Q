class NonStaticBlock8{
int a;
{
System.out.println("Inside non-static block. "+a);//0
a = 10;
}
{
System.out.println("Inside non-static block. "+a);//10
a = 20;
}
NonStaticBlock8(){
	this(200);
System.out.println("Inside 0 args constructor. "+a);//200
a = 100;
}
NonStaticBlock8(int a){
	System.out.println("Inside 1 args constructor. "+this.a);//20
	this.a = a;
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
new NonStaticBlock8();
System.out.println("Stop @Cyber Success");
}
}
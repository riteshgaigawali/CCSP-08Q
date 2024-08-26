class StaticBlock8{
int a;

{
System.out.println("Inside non-static block. "+a);//0
a = 10;
}

StaticBlock8(){
System.out.println("Inside 0 args constructor. "+a);//10
a = 100;
System.out.println("After inside 0 args constructor. "+a);//100
}

StaticBlock8(int a){
System.out.println("Inside 1 args constructor. "+this.a);//100 --> 10
this.a = a;
System.out.println("After inside 1 args constructor. "+this.a);//200
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
StaticBlock8 obj1 = new StaticBlock8();
StaticBlock8 obj2 = new StaticBlock8(200);
System.out.println("Stop @Cyber Success");
}

}
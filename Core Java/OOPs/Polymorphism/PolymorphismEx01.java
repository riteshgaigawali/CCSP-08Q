class PolymorphismEx01{
void m1(){
System.out.println("Inside 0 args m1 method.");
}
void m1(int a){
System.out.println("Inside 1 args m1 method. "+a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
OverloadingEx1 obj = new OverloadingEx1();
obj.m1(20);
System.out.println("Stop @Cyber Success");
}
}
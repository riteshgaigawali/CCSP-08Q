class PolymorphismEx04{
void m1(int a){
System.out.println("Inside 1 int args m1 method. "+a);
}
void m1(float b){
System.out.println("Inside 1 float args m1 method. "+b);
}
void m1(){
System.out.println("Inside 0 args m1 method.");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
PolymorphismEx04 ref = new PolymorphismEx04();
ref.m1();
System.out.println("Stop @Cyber Success");
}
}
class PolymorphismEx03{
void m1(int a){
System.out.println("Inside 1 int args m1 method. "+a);
}
void m1(float b){
System.out.println("Inside 1 float args m1 method. "+b);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
PolymorphismEx03 ref = new PolymorphismEx03();
ref.m1(20);
System.out.println("Stop @Cyber Success");
}
}
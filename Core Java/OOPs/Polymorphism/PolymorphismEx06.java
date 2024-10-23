class PolymorphismEx06{
PolymorphismEx06(float b){
System.out.println("Inside 1 float args constructor. "+b);
}
PolymorphismEx06(int a){
System.out.println("Inside 1 int args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
PolymorphismEx06 ref = new PolymorphismEx06(100.5f);
System.out.println("Stop @Cyber Success");
}
}
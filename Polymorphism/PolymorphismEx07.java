class PolymorphismEx07{
PolymorphismEx07(int a){
System.out.println("Inside 1 int args constructor. "+a);
}
PolymorphismEx07(float a){
System.out.println("Inside 1 float args constructor. "+a);
}
PolymorphismEx07(boolean b, char c){
System.out.println("Inside 2 args constructor. "+b+" "+c);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
PolymorphismEx07 ref = new PolymorphismEx07(true,'X');
System.out.println("Stop @Cyber Success");
}
}
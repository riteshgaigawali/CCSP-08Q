class OverloadingEx6{
OverloadingEx6(float b){
System.out.println("Inside 1 float args constructor. "+b);
}
OverloadingEx6(int a){
System.out.println("Inside 1 int args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
OverloadingEx6 ref = new OverloadingEx6(100.5f);
System.out.println("Stop @Cyber Success");
}
}
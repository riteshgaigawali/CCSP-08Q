class NonStaticBlock6{
{
System.out.println("Inside non-static block - one.");
}
NonStaticBlock6(){
System.out.println("Inside 0 args constructor.");
}
NonStaticBlock6(int a){
System.out.println("Inside 1 args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticBlock6 obj1 = new NonStaticBlock6();
NonStaticBlock6 obj2 = new NonStaticBlock6(10);
System.out.println("Stop @Cyber Success");
}
}
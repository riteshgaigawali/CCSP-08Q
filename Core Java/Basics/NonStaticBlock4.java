class NonStaticBlock4{
{
System.out.println("Inside non-static block - one.");
}
NonStaticBlock4(){
System.out.println("Inside 0 args constructor.");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticBlock4 obj = new NonStaticBlock4();
System.out.println("Stop @Cyber Success");
}
}
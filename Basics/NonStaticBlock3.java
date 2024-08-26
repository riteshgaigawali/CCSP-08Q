class NonStaticBlock3{
{
System.out.println("Inside non-static block - one.");
}
{
System.out.println("Inside non-static block - two.");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticBlock3 obj = new NonStaticBlock3();
System.out.println("Stop @Cyber Success");
}
}
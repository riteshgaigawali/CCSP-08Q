class NonStaticBlock5{
{
System.out.println("Inside non-static block - one.");
}
{
System.out.println("Inside non-static block - two.");
}
NonStaticBlock5(){
System.out.println("Inside 0 args constructor.");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticBlock5 obj = new NonStaticBlock5();
System.out.println("Stop @Cyber Success");
}
}
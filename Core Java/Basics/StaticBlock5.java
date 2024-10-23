class StaticBlock5{
static 
{
System.out.println("Inside static block.");
}
{
System.out.println("Inside non-static block.");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
StaticBlock5 obj1 = new StaticBlock5();
StaticBlock5 obj2 = new StaticBlock5();
System.out.println("Stop @Cyber Success");
}
}
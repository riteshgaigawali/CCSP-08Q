class StaticMethod6{
public static void main(String args[]){
	
	System.out.println("Start @Cyber Success");
	int a=100; // local variable
	method6(a); // pass by value
	System.out.println("Stop @Cyber Success");
}
static void method6(int x)//here x is local variable
{
	System.out.println("Inside method6...");
	System.out.println(x);
}


}
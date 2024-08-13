class Cyber{
static char c = 'x';
static void test(){
System.out.println("Inside test method...");
}
}
class Combo6{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Combo6 combo = new Combo6();
combo.m1();
System.out.println("Start @Cyber Success");
}
void m1(){
System.out.println("Inside m1 method...");

// Using className
System.out.println(Cyber.c);
Cyber.test();
// By creating object
Cyber ref = new Cyber();
System.out.println(ref.c);
ref.test();
}
}
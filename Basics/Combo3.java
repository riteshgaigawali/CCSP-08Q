class Combo3{
int a = 100;
void m1(){
System.out.println("Inside m1 method...");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
test();
System.out.println("Start @Cyber Success");
}
static void test(){
System.out.println("Inside test method...");

//call non-static members with object
Combo3 combo = new Combo3();
System.out.println(combo.a);
combo.m1();
}
}
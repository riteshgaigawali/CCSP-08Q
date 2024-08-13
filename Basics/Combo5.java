class Combo5{
static char c = 'x';
static void test(){
System.out.println("Inside test method...");
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
// Direct access
System.out.println(c);
test();
// Using className
System.out.println(Combo5.c);
Combo5.test();
// By creating object
Combo5 combo = new Combo5();
System.out.println(combo.c);
combo.test();
System.out.println("Start @Cyber Success");
}

}
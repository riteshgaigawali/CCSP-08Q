/*
Upcasting through pass-by-value demonstration.
*/
class GrandParent{
int a = 100;
void m1(){
System.out.println("Inside m1 method - GrandParent "+a);
}
}
class Parent extends GrandParent{
float b = 200.5f;
void m2(){
System.out.println("Inside m2 method - Parent "+b);
}
}
class Child extends Parent{
char c = 'X';
void m3(){
System.out.println("Inside m3 method - Child "+c);
}
}
class Test{
static void test(GrandParent gp){
System.out.println("Inside test method.");
gp.m1();
}
}
class PolymorphismEx2{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

//Upcasting
//GrandParent gp = new Child();
Test.test(new Child());

System.out.println("Stop @Cyber Success");
}

}
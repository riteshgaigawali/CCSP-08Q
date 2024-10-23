class Cyber{
static float x = 150.5f;
static void m1(){

System.out.println("Inside Cyber's m1 method");

}

}
class Combo2{

public static void main(String args[]){
System.out.println("Start @Cyber Success");


System.out.println(Cyber.x); Cyber.m1(); //Access using classname

Cyber c = new Cyber();
System.out.println(c.x); c.m1(); //Access using reference variable

System.out.println("Stop @Cyber Success");


}


}
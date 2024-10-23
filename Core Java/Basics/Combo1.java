class Combo1{

static int a =100;

static void m1(){
System.out.println("Inside m1 method...");
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");

System.out.println(a); m1(); //Ḍirect access

System.out.println(Combo1.a); Combo1.m1(); //Access using classname

Combo1 c = new Combo1();
System.out.println(c.a); c.m1(); //Access using reference variable

System.out.println("Stop @Cyber Success");


}


}
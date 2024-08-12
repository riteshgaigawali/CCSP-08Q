class NonStaticVar2{

char x='a';
boolean b = true;
float f = 100.5f;

public static void main(String args[]){
System.out.println("Start @Cyber Success");

NonStaticVar2 ns = new NonStaticVar2();
System.out.println(ns.x); //Access using reference variable --> Valid
System.out.println(ns.b); //Access using reference variable --> Valid
System.out.println(ns.f); //Access using reference variable --> Valid


System.out.println("Start @Cyber Success");

}

}
class NonStaticVar1{

char x='a';

public static void main(String args[]){
System.out.println("Start @Cyber Success");

//System.out.println(x); Direct access --> Invalid
//System.out.println(NonStaticVar1.x); Classname --> Invalid

NonStaticVar1 ns = new NonStaticVar1();
System.out.println(ns.x); //Access using reference variable --> Valid


System.out.println("Start @Cyber Success");

}

}
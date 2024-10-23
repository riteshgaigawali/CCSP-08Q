class ObjCreation2{
public static void main(String args[]){
System.out.println("Start @Cyber Success");

ObjCreation2 ref = new ObjCreation2();//Named object creation.
ref.m1();

new ObjCreation2().m1(); // Name less object creation

System.out.println("Stop @Cyber Success");
}

void m1(){
System.out.println("Inside m1 method....");
}

}
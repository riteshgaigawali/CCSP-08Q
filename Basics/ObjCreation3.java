class ObjCreation3{

int a = 100;

void test(){
System.out.println("Inside test method....");
}

static void m1(ObjCreation3 ref){
System.out.println("Inside m1 method....");
System.out.println(ref.a);
ref.test();
}


public static void main(String args[]){
System.out.println("Start @Cyber Success");

ObjCreation3 ref = new ObjCreation3();//Named object creation.
m1(ref);

m1(new ObjCreation3()); // Name less object creation

System.out.println("Stop @Cyber Success");
}

}
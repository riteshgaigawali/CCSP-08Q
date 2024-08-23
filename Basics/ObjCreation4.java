class ObjCreation4{
int a = 100;
void test(){
System.out.println("Inside test method...");
}
static ObjCreation4 m1(){
System.out.println("Inside m1 method...");

//ObjCreation4 ref = new ObjCreation4();
//return ref;

return new ObjCreation4();
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");

ObjCreation4 ref = m1();

System.out.println(ref.a);
ref.test();

System.out.println("Stop @Cyber Success");
}

}
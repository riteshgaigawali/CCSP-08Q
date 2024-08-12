class NonStaticMethod3{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
int a=10;
float b=20.5f;
NonStaticMethod3 ns = new NonStaticMethod3();
int result1 = ns.m1(a);
float result2 = ns.m2(b);
float result = result1 + result2;
System.out.println(result);

System.out.println("Stop @Cyber Success");
}

int m1(int a){

System.out.println("Inside not static method m1()....");
int result = a + 200;
return result;
}
float m2(float b){
System.out.println("Inside not static method m2()....");
float result = b + 300.5f;
return result;
}
}
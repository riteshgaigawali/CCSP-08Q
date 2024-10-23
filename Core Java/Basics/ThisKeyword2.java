class ThisKeyword2{
int a = 20;

void m1(int a){
System.out.println("Inside m1 method...");
System.out.println(a + this.a);
}

public static void main(String args[]){

System.out.println("Start @Cyber Success");

ThisKeyword2 ref1 = new ThisKeyword2();
ref1.m1(10);

ThisKeyword2 ref2 = new ThisKeyword2();
ref2.m1(100);

System.out.println("Stop @Cyber Success");

}
}
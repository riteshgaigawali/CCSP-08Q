class ThisKeyword1{
int a = 20;

void m1(int a){
System.out.println(a);

ThisKeyword1 ref = new ThisKeyword1();
System.out.println(ref.a);


System.out.println(this.a);
}

public static void main(String args[]){

System.out.println("Start @Cyber Success");

ThisKeyword1 ref = new ThisKeyword1();
ref.m1(10);

System.out.println("Stop @Cyber Success");

}
}
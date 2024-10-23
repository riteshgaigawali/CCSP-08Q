class Constructor8{
int a;

Constructor8(){
System.out.println("Inside 0 args constructor. "+ a);
a = 100;
}
void m1(){
System.out.println("Inside m1 method. "+ a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");

Constructor8 ref = new Constructor8();
ref.m1();

System.out.println("Stop @Cyber Success");
}

}
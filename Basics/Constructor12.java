class Constructor12{
int a;

Constructor12(){
System.out.println("Inside 0 args constructor. "+a);
a = 10;
}
void m1(){
System.out.println("Inside m1 method. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
new Constructor12().m1();
System.out.println("Stop @Cyber Success");
}

}
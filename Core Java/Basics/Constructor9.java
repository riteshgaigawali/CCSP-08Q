class Constructor9{
int a;

Constructor9(int a){
System.out.println("Inside 1 args constructor. "+ this.a);
this.a = a;
}

void m1(){
System.out.println("Inside m1 method. "+a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");

Constructor9 ref = new Constructor9(10);
ref.m1();

System.out.println("Stop @Cyber Success");
}

}
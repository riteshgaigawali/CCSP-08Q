class ThisKeyword3{
int a = 20;

static void m1(int a){
System.out.println("Inside m1 method...");
System.out.println(a + this.a); // Error this cannot be used in static context
}

public static void main(String args[]){

System.out.println("Start @Cyber Success");
m1(10);
m1(100);
System.out.println("Stop @Cyber Success");

}
}
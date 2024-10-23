class Sample{
int a = 100;
void m1(){
System.out.println("Inside m1 method...");
}
}
class Combo4{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
//call non-static members with object
Sample sample = new Sample();
System.out.println(sample.a);
sample.m1();
System.out.println("Start @Cyber Success");
}

}
class Demo{
int a=100;
static float b;
}
class Sample{
static int x;
float y=200.5f;
}
class NonStaticVar5{
	
	
	public static void main(String args[]){
System.out.println("Start @Cyber Success");

Demo d=new Demo();
Sample s=new Sample();

d.b=s.y;
s.x=d.a;

System.out.println(s.x);
System.out.println(d.b);
System.out.println("Stop @Cyber Success");
}
}
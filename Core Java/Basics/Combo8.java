class Sample{
boolean status = true;
 void m1(){
	 System.out.println("Inside m1 method...");
 }
}
class Combo8{
public static void main(String args[]){
	
	System.out.println("Start @Cyber Success");
	Combo8 combo = new Combo8();
	combo.test();
	System.out.println("Start @Cyber Success");
}
void test(){
	
	// By creating object
	Sample sample = new Sample();
	System.out.println(sample.status);
	sample.m1();
}

}
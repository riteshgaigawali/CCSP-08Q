class NonStaticMethod1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		NonStaticMethod1 nm = new NonStaticMethod1();
		nm.m1();
		System.out.println("Stop @Cyber Success");
}
void m1(){
System.out.println("Inside m1 method....");
}
}
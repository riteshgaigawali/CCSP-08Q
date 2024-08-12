class NonStaticMethod2{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int a=10;
		float b=20.5f;
		
		NonStaticMethod2 nm = new NonStaticMethod2();
		float result=nm.m1(a,b);
		
		System.out.println(result);
		System.out.println("Stop @Cyber Success");
}
float m1(int a, float b){
System.out.println("Inside m1 method....");
float result= a + b;
return result;
}
}
class Demo{
	static float method(int a){
		
		System.out.println("Inside method...");
		float result = a + 20.5f;
		return result;
	}
}	

class StaticMethod11{

public static void main(String args[]){
	System.out.println("Start @Cyber Success");
	int a=10;
	float result = Demo.method(a);
	System.out.println("Result is "+ result);
	System.out.println("Stop @Cyber Success");
}
	

}
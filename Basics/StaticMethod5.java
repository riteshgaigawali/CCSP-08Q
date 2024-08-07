class Demo{
static void test(){
System.out.println("Inside Demo.test ");
}
}
class StaticMethod5{
	
	public static void main(String args[]){
		System.out.println("Start....");
		Demo.test();
		System.out.println("End....");
		
	}
}
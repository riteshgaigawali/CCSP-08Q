class StaticMethod2{
	
	public static void main(String args[]){
		System.out.println("Start @CyberSuccess ");
		method2();
		System.out.println("End @CyberSuccess ");
	
	}
	static void method2(){
		return; // Invalid
		System.out.println("Inside method2... ");
	
	}
}
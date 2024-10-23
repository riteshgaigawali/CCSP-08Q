/*
- What is the difference between normal Inner Class and a Static Inner Class ?
>> In a Normal Inner Class will come under non-static Inner class and the area will also be non-static, whereas a Static Inner Class by nature is static and the area under which it comes will also be static by nature.
*/

//Normal class
class InnerClassEx19{
	
	int a = 100;
	static float b = 200.5f;
	
	//Static Inner Class
	static class Inner{
		void m1(){
			System.out.println("Inside m1 method.");
			InnerClassEx19 o = new InnerClassEx19();
			System.out.println(o.a + b);
		}
	}
	
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		InnerClassEx19.Inner i = new InnerClassEx19.Inner();
		i.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
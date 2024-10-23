/*
		2) Non-static Inner classes :
				2.2 Method-local Inner classes
					
- When we declare a class within a method such classes are called as Method-local Inner classes.

			void method(){
				class{
					
				}
			}
			
- When do we go for method-local inner classes ?
>> Whenever there is one-time use of the class we go for Inner classes.
   Whenever we need to access a service(method) and want to use certain characteristics we go for method-local inner classes.

- In method-local inner classes from the time the method gets loaded till the time method exits from the stack we can declare, instantiate and access members of the class + destroy the class.

*/
class Outer{
 
	void m1(){
		System.out.println("Inside m1 method.");
		
		class Inner{
			
		int a = 100;
		
		}
		
		Inner i = new Inner();
		System.out.println(i.a);
	}
		
}

//controller class
class InnerClassEx13{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		// outerObject --> m1();
		new Outer().m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
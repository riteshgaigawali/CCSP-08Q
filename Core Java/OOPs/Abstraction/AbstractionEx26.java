/*
- Java8 Features for interfaces :-

1. default keyword : The default keyword was introduced for interfaces only.
2. The default keyword was meant to inform the compiler/jvm that we are able to create complete methods within an interface.
3. The default keyword in an interface and default access modifier are two different concepts and are not releated to each other.
4. If a method in an interface is associated with default keyword still its access modifier will be public.
*/
interface Interface1{
	default void m1(){
		System.out.println("Inside m1 method. - Interface1");
	}
}
class AbstractionEx26 implements Interface1{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Interface1 ref = new AbstractionEx26();
		ref.m1();
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- If a class contains a complete method which has declaration and body as well that class is called as Normal class.
- If a class contain an incomplete method which has only declaration but no body also called as abstract method, such class is called as Abstract class.
- If a method is abstract which means it has only declaration but no body, such methods have to be prefixed with the keyword called as 'abstract'.
- If a class contains an abstract method, by default the class becomes abstract.
- To make the class as abstract it have to be prefixed with keyword called as 'abstract'.
*/

//class AbstractionEx01 error: AbstractionEx01 is not abstract and does not override abstract method method1() in AbstractionEx01
abstract class AbstractionEx01{
	
	//void method1(); error: missing method body, or declare abstract
	abstract void method1();
}
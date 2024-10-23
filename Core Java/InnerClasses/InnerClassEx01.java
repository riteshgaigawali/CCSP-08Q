/*
- Java supports inner classes but not inner methods.
- A class inside a class is called as Inner class.

- When and Why do we need concept of Inner classes ?
>> Whenever there is inter-dependency between classes, we go for the inner classes.
Whenever there is a need for one-time usage of the classes we go for the inner classes.

- What are the different types of inner classes :
1) Static Inner classes
2) Non-static Inner classes :
		2.1 Normal Inner classes
		2.2 Method-local Inner classes
		2.3 Anonymous Inner classes
		
 Note : Only inner classes can be made static or non-static.
 
- Whenever we compile a file with inner class it will generate two .class files one for the outer class (Outer.class) and one for the inner class seperated with '$'(dolar) symbol (Outer$Inner.class). 

*/
class Outer{
	class Inner{
		
	}
}

//controller class
class InnerClassEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
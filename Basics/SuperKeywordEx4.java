class Parent{
Parent(){
	this(10);
System.out.println("Inside 0 args constructor. - Parent");
}
Parent(int a){
System.out.println("Inside 1 args constructor. - Parent" + a);//10
}
}
class Child extends Parent{
Child(){
	this(20);
System.out.println("Inside 0 args constructor. - Child");
}
Child(int a){
	super();
	System.out.println("Inside 1 args constructor. - Child" +a);//20
}
}
class SuperKeywordEx4{
	public static void main(String args[]){
System.out.println("Start @Cyber Success");
Child c = new Child();
System.out.println("Stop @Cyber Success");
	}
}
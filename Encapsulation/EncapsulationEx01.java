/*
- Binding the members together with the intention of protecting the members such a process is called Encapsulation.
- In classes the members like variables, methods, and blocks are bounded by class hence this approach is called as Encapsulation.

- What do you mean by tightly bound encapsulation (data hidding) ?
>> By making the variables private within a class we can archive tightly bound encapsulation (data hidding).

*/
class Demo{
	
	private int a;
	
	public void setValue(int a){
		System.out.println("Inside setValue method.");
		this.a = a;
	}
	
	public int getValue(){
		System.out.println("Inside getValue method.");
		return a;
	}
}
class EncapsulationEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Demo ref = new Demo();
		ref.setValue(100);
		int a = ref.getValue();
		System.out.println(a);
		
		System.out.println("Stop @Cyber Success");
	}
}
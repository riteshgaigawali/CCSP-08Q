/*
		* Autoboxing and Unboxing
		
- Directely converting primitive data to wrapper objects is called as Autoboxing.
- And directely converting wrapper objects to primitive type data is called as Unboxing.

*/
class WrapperClassEx08{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Autoboxing
		Integer i = 100;
		System.out.println(i.toString());
		
		//Unboxing
		int a = i;
		//System.out.println(a.toString()); error: int cannot be dereferenced
		System.out.println(a);
		
		System.out.println("Stop @Cyber Success");
	}
}
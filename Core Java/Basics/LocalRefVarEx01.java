/*
 Non-Premitive 

 - A non-primitive type can also be called as class type, a non-premitive type can only be created on basis of classes. 
 - A non-premitive variable is only meant to store address of a paticular class type.
 - When a class type variable is declared within a method, constructor, or any block such variables are called as local reference variable.
 */
class LocalRefVarEx01 {
	boolean x = true;

	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		LocalRefVarEx01 ref = new LocalRefVarEx01();
		System.out.print(ref.x);
		System.out.println("Stop @Cyber Success");
	}

}
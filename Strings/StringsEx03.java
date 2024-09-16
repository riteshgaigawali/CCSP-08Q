/*
2. Using new keyword.

- Whenever we create a String object using new keyword it always creates a new object regardless of the object is duplicated or not, this objects are created within heap but outside of String constant pool.
 
*/
class StringsEx03{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = new String("Cyber");
		String str2 = new String("Success");
		String str3 = new String("Cyber");
		
		System.out.println(str1 == str3);//false
		System.out.println(str2);
		System.out.println(str3 == str1);//false
		
		System.out.println("Stop @Cyber Success");
	}
}
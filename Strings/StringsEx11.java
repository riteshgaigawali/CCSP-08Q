/*
- How do we convert String to StringBuffer ?
- How do we know that String is converted to StringBuffer ?
>> To check that String is converted to StringBuffer or not we can use reverse() and append() methods that are present in StringBuffer only.

- Write a program to reverse a String using reverse() method.
*/
class StringsEx11{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "Techcnology";
		
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf);//Techcnology
		System.out.println(sbf.reverse());//ygolonchceT
		
		System.out.println("Stop @Cyber Success");
	}
}

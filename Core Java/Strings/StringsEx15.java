/*
- In both equals(java.lang.String) and compareTo(java.lang.String) method comparison happens based on Case Sensitivity.
- To compare Strings by ignoring case sensitivity we can use equalsIgnoreCase(java.lang.String) and compareToIgnoreCase(java.lang.String).

*/
class StringsEx15{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = new String("Cyber");// C is in uppercase
		String str2 = new String("cyber");// c is in lowercase
		
		System.out.println(str1.equals(str2));// boolean -> false
		System.out.println(str1.compareTo(str2));// int -> -32
		
		System.out.println(" -------------------------------------------");
		
		System.out.println(str1.equalsIgnoreCase(str2));// boolean -> true
		System.out.println(str1.compareToIgnoreCase(str2));// int -> 0
		
		
		System.out.println("Stop @Cyber Success");
	}
}
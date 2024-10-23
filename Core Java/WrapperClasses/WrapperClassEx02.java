/*
- With respect to Integer wrapper class when do we get NumberFormatException ? 
>> Whenever in a constructor we are passing String data but that String data contains characters/symbols rather than containing the digits only, then it will throw NumberFormatException.

*/
class WrapperClassEx02{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Integer i1 = new Integer("100");
		System.out.println(i1);
		System.out.println(i1.toString());
		
		Integer i2 = new Integer("Hundred");
		System.out.println(i2);
		System.out.println(i2.toString());
		
		System.out.println("Stop @Cyber Success");
	}
}
/*		
Output :- 

		Start @Cyber Success
		100
		100
		Exception in thread "main" java.lang.NumberFormatException: For input string: "Hundred"
				at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
				at java.base/java.lang.Integer.parseInt(Integer.java:652)
				at java.base/java.lang.Integer.<init>(Integer.java:1096)
				at WrapperClassEx02.main(WrapperClassEx02.java:14)

*/
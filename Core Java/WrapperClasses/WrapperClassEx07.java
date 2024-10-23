/*
- How do we convert String data to primitive format ?
>> With the help of parseXXXXX() method we can convert String data to primitive format.

*/
class WrapperClassEx07{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = "500";
		String str2 = "200.5";
		
		System.out.println(str1 + str2);// 500200.5
		
		int a = Integer.parseInt(str1);
		float f = Float.parseFloat(str2);
		
		System.out.println(a + f);// 700.5
		
		System.out.println("Stop @Cyber Success");
	}
}
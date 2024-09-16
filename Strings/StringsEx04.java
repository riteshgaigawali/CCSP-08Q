/*
- Whenever we use ( == ) comparison operator to compare two Strings it will be responsible for reference comparison.

*/
class StringsEx04{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = "Cyber";
		String str2 = "Success";
		String str3 = "Cyber";
		
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str3);//false
		System.out.println(str3 == str1);//true
		
		String str4 = new String("Cyber");
		String str5 = new String("Success");
		String str6 = new String("Cyber");
		
		System.out.println(str4 == str6);//false
		System.out.println(str5 == str6);//false
		System.out.println(str6 == str4);//false
		
		System.out.println("Stop @Cyber Success");
	}
}
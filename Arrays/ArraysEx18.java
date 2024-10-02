/*
- We can use the concept of pass-by-value and return-by-value with the arrays, as shown in the following example.

*/
class ArraysEx18{
	
	void m1(int[] arr){
		System.out.println("Inside m1 method.");
		for(int a : arr){
			System.out.println(a);
		}
	}
	
	static String[] m2(){
		String[] strArr = new String[3];
		strArr[0] = "Cyber"; strArr[1] = "Success"; strArr[2] = "Institute";
		return strArr;
	}
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr1 = new int[3];
		arr1[0] = 100; arr1[1] = 200; arr1[2] = 300;
		ArraysEx18 ref = new ArraysEx18();
		//pass-by-value
		ref.m1(arr1);
		
		System.out.println("Back to the main method.");
		
		//return-by-value
		String[] arr2 = m2();
		for(String s : arr2){
			System.out.println(s);
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
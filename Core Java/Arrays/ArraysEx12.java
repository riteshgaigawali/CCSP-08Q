/*
- When we dont initialize any index of an Array the compiler initialize it with the default value of corresponding data-type.

*/

class ArraysEx12{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr1 = new int[5];
		
		arr1[0] = 10;
		arr1[2] = 20;
		arr1[4] = 30;
		
		for(int a : arr1){
			System.out.println(a);
		}
		
		String[] arr2 = new String[5];
		
		arr2[0] = "Cyber";
		arr2[2] = "Success";
		arr2[4] = "Training";
		
		for(String s : arr2){
			System.out.println(s);
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
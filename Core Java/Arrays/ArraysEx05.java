/*
- If we dont initialize the Array the compiler initializes it to default values of corresponding data-type.
*/
class ArraysEx05{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr1 = new int[3];
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);// 0
		}
		
		char[] arr2 = new char[3];
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);// ' '
		}
		
		boolean[] arr3 = new boolean[3];
		for(int i = 0; i < arr3.length; i++){
			System.out.println(arr3[i]);// false
		}
		
		float[] arr4 = new float[3];
		for(int i = 0; i < arr4.length; i++){
			System.out.println(arr4[i]);// 0.0
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
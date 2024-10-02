/*
- If we dont initialize the objects inside the Array it prints the default value.
- Object holds the null as by default value.
*/
class Cyber{
	
}
class ArraysEx06{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String[] arr1 = new String[3];
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);// null
		}
		
		Cyber[] arr2 = new Cyber[3];
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);// null
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
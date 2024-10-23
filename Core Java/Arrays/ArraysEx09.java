/*
	* for-each loop :
	
		- For-each loops are primarily used to extract data from an Arrays or Collections.
		- The for-each loop has an in-built feature for auto-increament and also has the feature to auto-check the condition or length.
		
		- Syntax :
			
			for(in which type you want to store the data : from where to extract the data){
				
			}
			
			ex: for(int a : arr){
				
			} 
*/
class ArraysEx09{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		//simple for loop
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//for-each loop
		for(int a : arr){
			System.out.println(a);
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- We can use length to iterate through all the array elements. 
*/
class Array4{
	public static void main(String args[]){
		
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(arr.length);
		
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
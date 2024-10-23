/*
- Arrays are by nature homogyneus, which means the arrays can store the elements of same type only.
- The arrays can store elements of same data type only.
*/
class Array5{
	public static void main(String args[]){
		
		String[] arr = {"Cyber", "Success", "Training", "Institute", "Pune"};
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
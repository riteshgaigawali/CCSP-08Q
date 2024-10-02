/*
- In all the previous examples the Arrays we were dealing with was Single-dimensional Arrays.
- However the information stored in such Arrays are limited, if we want to increase the data or information not only for one record but for multiple records it is not possible in Single-dimensional arrays.
- Hence we go for the Multi-dimensional or Two-dimensional arrays.

*/
class ArraysEx15{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);// first-dimension --> rows
		System.out.println(arr[0].length);// second-dimension --> columns
		
		System.out.println("Stop @Cyber Success");
	}
}
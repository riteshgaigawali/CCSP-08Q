/*
- Similar to one-dimensional arrays we can create multi-dimensional arrays with two approaches :
		1) Using new keyword :
			
			Syntax :- dataType[][] array-name = new dataType[size1][size2];
*/
class ArraysEx16{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Approach -1
		int[][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[1].length; j++){
				System.out.print(" " + arr[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
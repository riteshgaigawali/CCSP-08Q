/*
		2) Without using new keyword :
			
			Syntax :- dataType[][] array-name = { {data1, data2, ...}, {data1, data2, ...} };
*/
class ArraysEx17{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Approach -2
		String[][] arr = { {"A", "B", "C"}, {"D", "E", "F"} };
		
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[1].length; j++){
				System.out.print(" " + arr[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
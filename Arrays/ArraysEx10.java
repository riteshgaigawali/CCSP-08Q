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
class ArraysEx10{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String[] arr = {"Cyber", "Success", "Training", "Institute", "Pune"};
		
		for(String s : arr){
			System.out.println(s);
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
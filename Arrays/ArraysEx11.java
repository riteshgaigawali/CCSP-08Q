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

class ArraysEx11{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee(101, "Ritesh");
		arr[1] = new Employee(102, "Harshal");
		arr[2] = new Employee(103, "Sumit");
		
		
		for(Employee e : arr){
			System.out.println(e.empId + " - " + e.empName);
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
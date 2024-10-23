/*
- We can store any type of objects of homogeous type inside an Array.

*/
class ArraysEx08{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		
		Employee emp1 = new Employee(101, "Ritesh");
		Employee emp2 = new Employee(102, "Harshal");
		Employee emp3 = new Employee(103, "Sumit");
		
		
		Employee[] arr = new Employee[3];
		
		arr[0] = emp1;
		arr[1] = emp2;
		arr[2] = emp3;
		
		
		for(int i = 0; i < arr.length; i++){
			
			Employee e = arr[i];// e <-- arr[0], arr[1], arr[2]
			
			System.out.println(e.empId + " - " + e.empName);
		}
		
		
		
		System.out.println("Stop @Cyber Success");
	}
}
/*
- Whenever we get NullPointerException we can handle it using the exception classes or we can also use 'instanceof' operator.
- The 'instanceof' operator is responsible to generate a boolean output.
- The 'instanceof' operator compares the reference variable with the given class type and returns true if mathched else returns false.
*/
class ArraysEx14{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Employee[] arr = new Employee[5];
		
		arr[0] = new Employee(101, "Ritesh");
		arr[2] = new Employee(102, "Harshal");
		arr[4] = new Employee(103, "Sumit");
		
		
		for(Employee e : arr){
			
			if(e instanceof Employee){
				System.out.println(e.empId + " - " + e.empName);
			}else{
				System.out.println("Employee does not exsits. " +e);
			}
		}
		
		
		System.out.println("Stop @Cyber Success");
	}
}
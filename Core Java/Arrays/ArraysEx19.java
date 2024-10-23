/*
- Write a program to create an array that stores hetrogeneous type of data.
*/
class ArraysEx19{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Object[] objArr = new Object[3];
		
		//upcating all the objects to the parent which is Object class
		objArr[0] = new Employee(101, "Ritesh");
		objArr[1] = new Flipkart(500, "Samsung S23 Ultra");
		objArr[2] = new Integer(100);
		
		for(Object obj : objArr){
			if(obj instanceof Employee){
				//downcast to Employee
				Employee e = (Employee)obj;
				System.out.println(e.empId +"-"+ e.empName);
			}else if(obj instanceof Flipkart){
				//downcast to Flipkart
				Flipkart f = (Flipkart)obj;
				System.out.println(f.prodId +"-"+ f.prodName);
			}else if(obj instanceof Integer){
				//downcast to Integer
				Integer i = (Integer)obj;
				System.out.println(i);
			}
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
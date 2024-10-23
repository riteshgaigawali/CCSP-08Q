/*
		* Arrays :

- A variable at any point of time is meant to store only one value but an Array is meant to store multiple values.
- Whenever we store any value within an Array all the values are stored in an indexed order, starting from 0.

- How many ways are there to create an Array ?
>> There are two approaches to create an Array :
			1) Using new keyword.
			2) Without using new keyword.
			
			
	#1. By using new keyword :

		- Internally arrys are considered as class, because of which we can create an object using new keyword.
		- It involves : declaration, instantiation, and initialization.
			Ex : dataType[] arrayName = new dataType[size];
				int[] arr = new int[10];	

*/

class ArraysEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		//Approach -1
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		System.out.println("Stop @Cyber Success");
	}
}
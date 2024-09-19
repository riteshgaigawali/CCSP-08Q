/*
- The append() method appends (concatenate) a string to the end of another string.
- The append() method is a non-static method within String class, hence need to be called with reference to a String object.
- The StrignBuffer are mutable means we can make changes to the StringBuffer object within the heap memory.
- However if we make any changes to the StringBuffer object then Java will not create a new object inside heap, instead it will make changes to the object present in heap.
- StringBuffer uses less memory compared to String objects, hence is efficient than Strings.
*/
class StringsEx08{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		StringBuffer sbf = new StringBuffer("Cyber ");
		System.out.println(sbf);//Cyber
		System.out.println(sbf.append("Success"));//Cyber Success
		System.out.println(sbf);//Cyber Success
		
		
		System.out.println("Stop @Cyber Success");
	}
}

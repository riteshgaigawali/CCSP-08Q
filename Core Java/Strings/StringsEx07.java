/*
- The concat() method appends (concatenate) a string to the end of another string.
- The concat() method is a non-static method within String class, hence need to be called with reference to a String object.
- The Strigns are immutable means we cannot make changes to the String object within the String constant pool.
- However if we make any changes to the String object then Java will create a new object inside heap, instead of making changes to the object present in String constant pool within heap.

*/
class StringsEx07{
	
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str1 = "Cyber ";
		System.out.println(str1);//Cyber 
		System.out.println(str1.concat("Success"));//Cyber Success
		System.out.println(str1);//Cyber
		
		str1 = str1.concat("Success");//Returns : A String, representing the text of the combined strings.
		System.out.println(str1);//Cyber Success
		
		System.out.println("Stop @Cyber Success");
	}
}
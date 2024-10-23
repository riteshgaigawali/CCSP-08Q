/*
- Another example of split method with delimiter.
*/
class StringsEx22{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "This is, an example, of split method, in Java.";
		System.out.println(str);
		
		String[] strArr = str.split(",");// splits the words after a ',' and store them to Array of type String
		for(int i = 0; i < strArr.length ; i++){
			System.out.println(strArr[i]);// prints each String in an Array
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
// public String[] split(String regex)
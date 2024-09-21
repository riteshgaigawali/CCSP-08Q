/*
- split() method in Java :

The java string split() method splits this string against given regular expression and returns a char array.

There are two signature for split() method in java string :

1) public String[] split(String regex)  
  
2) public String[] split(String regex, int limit) 

Parameter :

1) regex : regular expression to be applied on string.

2) limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.

*/
class StringsEx21{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "This is an example of split method in Java.";
		System.out.println(str);
		
		String[] strArr = str.split(" ");// splits the words after a space and store them to Array of type String
		for(int i = 0; i < strArr.length ; i++){
			System.out.println(strArr[i]);// prints each String in an Array
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
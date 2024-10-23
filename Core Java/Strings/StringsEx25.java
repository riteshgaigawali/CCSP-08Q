/*

- In the StringTokenizer class, the delimiters can be provided at the time of creation or one by one to the tokens.

- In real-time we prefer to use split() method instead of StringTokenizer because, when we use StringTokenizer we need to create two objects one to hold the String and another to hold the StringTokenize.
- Where to use split() method we have to create only one object that is String object.

*/
import java.util.StringTokenizer;

class StringsEx25{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		String str = "This is, an example of, StringTokenizer class, in Java.";
		System.out.println(str);
		
		StringTokenizer stk = new StringTokenizer(str,",");// String to be split , delimiter
		
		while(stk.hasMoreElements()){
			System.out.println(stk.nextElement());
		}
		
		System.out.println("Stop @Cyber Success");
	}
}

// public java.util.StringTokenizer(java.lang.String , java.lang.String) -> String to be split , delimiter
/*
- How many constructors are supported by all the wrapper classes ?
>> Wrapper Class 							Constructors

1) Byte										byte, String
2) Short 									short, String
3) Integer									int, String
4) Long 									long, String
5) Float 									float, double, String
6) Double 									double, String
7) Character								char
8) Boolean									boolean, String

*/
class WrapperClassEx03{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		Float f1 = new Float(300.5f);
		System.out.println(f1);
		
		Float f2 = new Float(200.5);
		System.out.println(f2);
		
		Float f3 = new Float("500.5");
		System.out.println(f3);
		
		Character ch = new Character('X');
		System.out.println(ch);
		
		System.out.println("Stop @Cyber Success");
	}
}
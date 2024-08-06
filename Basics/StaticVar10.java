class StaticVar10{
	
	
	public static void main(String args[]){
		
		static int a=10; //error: illegal start of expression
		// We can't make local variables as static.
		System.out.print(a);
	}
}
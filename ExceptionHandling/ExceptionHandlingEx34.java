/*
      * 'throw' Keyword :

- The throw keyword is primarily used for two purposes :
1) It helps in customizing the exception info.
2) throw keyword is responsible to tell JVM to treat normal/custom classes as a type of exception class.

- The throw keyword is responsible to inform JVM that the object thrown should not be considered as type of normal object ceration, but should be considered and handled as a type of exception class object.

*/
class ExceptionHandlingEx34{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		int a = 0;
		
		if(a > 0){
			System.out.println("Arithmetic expresion is defined.");
		}else if(a == 0){
			System.out.println("Inside else-if conditional block.");
			throw new ArithmeticException("Arithmetic expresion is undefined.");
			//Exception in thread "main" java.lang.ArithmeticException: Arithmetic expresion is undefined.
		}
		
		System.out.println("Stop @Cyber Success");
	}
}
// public java.lang.ArithmeticException(java.lang.String)
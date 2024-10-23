/*
 - What is benifit of using methods ?
 - Why do we use methods ?
 -->
 - Methods are primiraly used to perform certain operations.
 - We create methods by identifying repetative as well as duplicate code.
 - If we don't use methods challeges are :
 1. Duplicate code will increase.
 2. This will increase the length of code, resulting high memory usage and more time for execution.
 3. Thus application gets slow and there is no reusability of code.
 - To tackel this challenges we use methods.
 - Due to methods benifits are :
 1. Duplicate code will decreases.
 2. This will reduse the length of code, resulting efficient memory usage and less time for execution.
 3. Thus application gets fast and there is reusability of code.

 - Syntax for creating a method : 
 
 			[Access modifier] [Modifier] return-type method-name([args/parameters]){ 
 																					statements to be executed 
																					[return value;]
																					}

 - Return statement is used to return back to the caller method.
 - We use 'void' as a return type whenever the method only return the control but no data.
 - However if a method return a data then based on that data we have to also mention the return type.
 */
class StaticMethodEx01 {
	public static void main(String args[]) {

		System.out.println("Start @CyberSuccess ");
		method1();
		System.out.println("End @CyberSuccess ");

	}

	static void method1() {
		System.out.println("Inside method1...");
		// return;

	}
}
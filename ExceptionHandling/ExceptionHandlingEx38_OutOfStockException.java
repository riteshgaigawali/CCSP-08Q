/*
- To create user-defined Unchecked exceptions the respective class should extend RuntimeException class.
- parameterised constructor-based exception.
*/
class OutOfStockException extends RuntimeException{
	
	OutOfStockException(String exceptionInfo){
		super(exceptionInfo);
	}
	
}
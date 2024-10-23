/*
- To create user-defined Checked exceptions the respective class should extend Exception class.
- parameterised constructor-based exception.
*/
class AmountTransferException extends Exception{
	
	AmountTransferException(String exceptionInfo){
		super(exceptionInfo);
	}

}
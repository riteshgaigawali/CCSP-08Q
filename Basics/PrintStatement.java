/*The way print() statement works is; it will print the messege and then move the control at the end of the statement, if there is one more print() statement it will start printing from the end fo the first messege and move the control at the end.*/

class PrintStatement{
public static void main(String args[]){
System.out.print("First Statement ");
System.out.print("Second Statement ");
}
}
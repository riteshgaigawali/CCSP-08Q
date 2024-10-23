class Employee{
int empId;
String empName;
int empSal;

Employee(int empId, String empName, int empSal){
this.empId = empId;
this.empName = empName;
this.empSal = empSal;
}

void getEmpInfo(){
System.out.println("Employee ID :- "+ empId + " Employee name :- "+empName+" Employee salary :- "+empSal);
}

}
class Constructor11{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Employee emp1 = new Employee(1,"Ritesh",20000);
emp1.getEmpInfo();
Employee emp2 = new Employee(2,"Harshal", 15000);
emp2.getEmpInfo();
System.out.println("Stop @Cyber Success");
}

}
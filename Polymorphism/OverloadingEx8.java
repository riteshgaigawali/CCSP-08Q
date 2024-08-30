class Hdfc{
Hdfc(String custName, int adharId){
System.out.println("Thank you! , You personal account with name "+custName+" is created successfuly.");
}
Hdfc(String companyName, String custName, int adharId){
System.out.println("Thank you! , You company account with name "+companyName+" is created successfuly.");
}
}
class OverloadingEx8{
public static void main(String args[]){
System.out.println("Start @Cyber Success");
Hdfc cust1 = new Hdfc("Ritesh",5285);
Hdfc cust2 = new Hdfc("Cyber Success","Ritesh",5282);
System.out.println("Stop @Cyber Success");
}
}

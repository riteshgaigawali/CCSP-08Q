class Constructor4{

Constructor4(){
System.out.println("Inside 0 args constructor.");
}

Constructor4(int a){
System.out.println("Inside 1 args constructor." + a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
Constructor4 cost1 = new Constructor4();
Constructor4 cost2 = new Constructor4(10);
System.out.println("Stop @Cyber Success");
}
}
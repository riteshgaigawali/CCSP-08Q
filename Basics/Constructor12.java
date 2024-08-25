class Constructor12{

Constructor12(){
this(10);
System.out.println("Inside 0 args constructor.");
}

Constructor12(int a){
System.out.println("Inside 1 args constructor. " + a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
Constructor12 ref = new Constructor12();
System.out.println("Stop @Cyber Success");
}

}
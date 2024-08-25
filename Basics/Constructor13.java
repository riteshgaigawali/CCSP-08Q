class Constructor13{

Constructor13(){
System.out.println("Inside 0 args constructor.");
this(10); // This will give error :  call to this must be first statement in constructor
}

Constructor13(int a){
System.out.println("Inside 1 args constructor. " + a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
Constructor13 ref = new Constructor13();
System.out.println("Stop @Cyber Success");
}

}
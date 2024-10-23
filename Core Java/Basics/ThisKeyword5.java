class ThisKeyword5{

ThisKeyword5(){
System.out.println("Inside 0 args constructor.");
this(10); // This will give error :  call to this must be first statement in constructor
}

ThisKeyword5(int a){
System.out.println("Inside 1 args constructor. " + a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
ThisKeyword5 ref = new ThisKeyword5();
System.out.println("Stop @Cyber Success");
}

}
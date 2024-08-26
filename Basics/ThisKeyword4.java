class ThisKeyword4{

ThisKeyword4(){
this(10);
System.out.println("Inside 0 args constructor.");
}

ThisKeyword4(int a){
System.out.println("Inside 1 args constructor. " + a);
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
ThisKeyword4 ref = new ThisKeyword4();
System.out.println("Stop @Cyber Success");
}

}
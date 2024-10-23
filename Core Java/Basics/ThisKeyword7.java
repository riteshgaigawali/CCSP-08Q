class ThisKeyword7{
int a;

ThisKeyword7(int a){
this();
this.a = a;
System.out.println("Inside 1 args constructor. "+this.a);
}

ThisKeyword7(){
System.out.println("Inside 0 args constructor.");
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");
new ThisKeyword7(200);
System.out.println("Stop @Cyber Success");
}

}
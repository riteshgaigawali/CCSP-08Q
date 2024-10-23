class ThisKeyword6{
ThisKeyword6(){
this(10);
System.out.println("Inside 0 args constructor.");
}
ThisKeyword6(int a){
this(200,20.5f);
System.out.println("Inside 1 args constructor. "+a);
}
ThisKeyword6(int a, float b){
System.out.println("Inside 2 args constructor. "+a+" "+b);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
new ThisKeyword6();
System.out.println("Stop @Cyber Success");
}
}
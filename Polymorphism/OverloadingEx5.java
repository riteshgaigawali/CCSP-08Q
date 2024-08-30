class OverloadingEx5{
OverloadingEx5(){
System.out.println("Inside 0 args constructor.");
}
OverloadingEx5(int a){
System.out.println("Inside 1 args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
OverloadingEx5 ref = new OverloadingEx5(100);
System.out.println("Stop @Cyber Success");
}
}
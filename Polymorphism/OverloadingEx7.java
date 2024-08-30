class OverloadingEx7{
OverloadingEx7(int a){
System.out.println("Inside 1 int args constructor. "+a);
}
OverloadingEx7(float a){
System.out.println("Inside 1 float args constructor. "+a);
}
OverloadingEx7(boolean b, char c){
System.out.println("Inside 2 args constructor. "+b+" "+c);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
OverloadingEx7 ref = new OverloadingEx7(true,'X');
System.out.println("Stop @Cyber Success");
}
}
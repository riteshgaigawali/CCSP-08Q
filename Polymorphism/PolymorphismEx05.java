class PolymorphismEx05{
PolymorphismEx05(){
System.out.println("Inside 0 args constructor.");
}
PolymorphismEx05(int a){
System.out.println("Inside 1 args constructor. "+a);
}
public static void main(String args[]){
System.out.println("Start @Cyber Success");
PolymorphismEx05 ref = new PolymorphismEx05(100);
System.out.println("Stop @Cyber Success");
}
}
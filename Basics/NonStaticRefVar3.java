class NonStaticRefVar3{
NonStaticRefVar3 ref = new NonStaticRefVar3(); // This line will cause 'StackOverflowError'

public static void main(String args[]){
System.out.println("Start @Cyber Success");
NonStaticRefVar3 ref1 = new NonStaticRefVar3();
System.out.println("Stop @Cyber Success");
}

}
class Constructor6{

Constructor6(int a){
System.out.println("Inside 1 args constructor. "+a );
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");

Constructor6 ref1 = new Constructor6(100);

Constructor6 ref2 = new Constructor6(); // Error :constructor Constructor6 in class Constructor6 cannot be applied to given types;

System.out.println("Stop @Cyber Success");
}

}
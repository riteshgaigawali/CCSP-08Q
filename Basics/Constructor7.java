class Constructor7{

Constructor7(){
System.out.println("Inside 0 args constructor.");
}

public static void main(String args[]){
System.out.println("Start @Cyber Success");

//named object creation
Constructor7 ref1 = new Constructor7();

//nameless
new Constructor7();

// Constructor7 ref; Here the constructor is never called.

System.out.println("Stop @Cyber Success");
}

}
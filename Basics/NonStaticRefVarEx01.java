/*
 - When the class type variables are declared within class but outside the method, constructor, or any block and are not prefixed with keyword static such variables are called are non-static reference variables.
 - The non-static reference variables can't be accessed directly within the other blocks of class or another class.
 - To access the non-static reference variables we need to create an object of the class where they resides.
 */
class NonStaticRefVarEx01 {
    int a = 100;
    NonStaticRefVarEx01 ref;

    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        NonStaticRefVarEx01 ref1 = new NonStaticRefVarEx01();
        ref1.ref = new NonStaticRefVarEx01();
        System.out.println(ref1.a);
        System.out.println(ref1.ref.a);

        ref1.a = 250;
        ref1.ref.a = 500;

        System.out.println(ref1.a);
        System.out.println(ref1.ref.a);

        System.out.println("Stop @Cyber Success");
    }
}
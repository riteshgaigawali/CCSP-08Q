/*
 - Variables that are declared inside a class but outside the method, constructor, or blocks are called as non-static variables.
 - How do you access non-static variables ?
 --> Non-static variables can't be accessed directly  or using class-name, we can access non-static variables by creating an object of the class.
 */
class NonStaticVarEx01 {

    char x = 'a';

    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");

        // System.out.println(x); Direct access --> Invalid
        // System.out.println(NonStaticVar1.x); Classname --> Invalid

        NonStaticVarEx01 ns = new NonStaticVarEx01();
        System.out.println(ns.x); // Access using reference variable --> Valid

        System.out.println("Start @Cyber Success");

    }

}
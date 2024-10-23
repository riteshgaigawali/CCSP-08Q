/*
 - With your experience as developer/tester can you tell me where exactly are non-static variables created ?
 --> Inside the RAM the non-static variables are created inside an object of that class, which is the part of heap.
 */
class NonStaticVarEx02 {

    char x = 'a';
    boolean b = true;
    float f = 100.5f;

    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");

        NonStaticVarEx02 ns = new NonStaticVarEx02();
        System.out.println(ns.x); // Access using reference variable --> Valid
        System.out.println(ns.b); // Access using reference variable --> Valid
        System.out.println(ns.f); // Access using reference variable --> Valid

        System.out.println("Start @Cyber Success");

    }

}
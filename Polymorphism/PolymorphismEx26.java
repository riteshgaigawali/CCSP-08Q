/*
In the Child class if there is no same method signature as Parent (eg. Overriding is not present), it will then perform Upcasting and Downcasting.
*/

class Parent {
    void homeKeys() {
        System.out.println("Home keys - Parent");
    }
}

class Child extends Parent {
    void job() {
        System.out.println("Job method - Child");
    }
}

class PolymorphismEx26{
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");

        // Upcasting
        Parent p = new Child();
        p.homeKeys(); // p.job(); //--> Invalid

        System.out.println(" ---------------------------- ");

        // Downcasting
        Child c = (Child) p;
        c.homeKeys();
        c.job();

        System.out.println("Stop @Cyber Success");
    }
}
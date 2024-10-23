//Single Inheritance
class Parent {
    int a = 100;

    void m1() {
        System.out.println("Inside m1 method.");
    }
}

class Child extends Parent {
    float b = 20.5f;

    void m2() {
        System.out.println("Inside m2 method.");
    }
}

class InheritanceEx2 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");

        // Parent
        Parent p1 = new Parent();
        System.out.println(p1.a);
        p1.m1();
        // System.out.println(p1.b); p1.m2(); Error : cannot access child member with
        // parent class object

        // Child
        Child c1 = new Child();
        System.out.println(c1.b);
        System.out.println(c1.a);
        c1.m2();
        c1.m1();
        System.out.println("Stop @Cyber Success");
    }

}
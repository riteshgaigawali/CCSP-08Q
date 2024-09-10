final class Parent {
    int a = 10;

    void m1() {
        System.out.println("Inside m1 method.");
    }
}

class Child1 extends Parent { // error: cannot inherit from final Parent
    float b = 20.5f;

    void m2() {
        System.out.println("Inside m2 method.");
    }
}

class InheritanceEx7 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        System.out.println("Stop @Cyber Success");
    }
}
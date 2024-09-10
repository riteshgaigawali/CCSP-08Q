class Parent {
    void m1() {
        System.out.println("Inside m1 method. - Parent");
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("Inside m1 method. - Child");
    }

    void test() {
        System.out.println("Inside test method. - Child");
        this.m1();
        super.m1();
    }
}

class SuperKeywordEx2 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child();
        c.test();
        System.out.println("Stop @Cyber Success");
    }
}
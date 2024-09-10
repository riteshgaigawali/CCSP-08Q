class Parent {
    int a = 1000;
    float b = 2000.5f;
}

class Child extends Parent {
    int a = 100;
    float b = 200.5f;

    void m1(int a, float b) {
        System.out.println("Inside m1 method.");
        System.out.println(a + b);// 30.5
        System.out.println(this.a + this.b);// 300.5
        System.out.println(super.a + super.b);// 3000.5
    }

}

class SuperKeywordEx1 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child();
        c.m1(10, 20.5f);
        System.out.println("Stop @Cyber Success");
    }
}
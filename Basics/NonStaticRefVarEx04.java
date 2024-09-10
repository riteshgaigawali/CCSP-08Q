/*
 Assingment question : 2
 */
class Demo {
    int a = 100;
}

class Sample {
    void m1() {
        System.out.println("Inside m1...");
    }
}

class NonStaticRefVarEx04 {
    Demo demo = new Demo();
    Sample samp = new Sample();

    public static void main(String args[]) {
        System.out.println("Start...");
        NonStaticRefVarEx04 ref = new NonStaticRefVarEx04();
        System.out.println(ref.demo.a);
        ref.samp.m1();
    }

}
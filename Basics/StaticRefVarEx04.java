/*
 Assingment question : 2
 */
class Demo {
    int a = 100;

    void m1() {
        System.out.println("Inside m1 method...");

    }
}

class Sample {
    static Demo demoRef = new Demo();
}

class StaticRefVarEx04 {

    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        System.out.println(Sample.demoRef.a);
        Sample.demoRef.m1();
        System.out.println("Stop @Cyber Success");
    }

}
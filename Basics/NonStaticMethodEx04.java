/* 
 Assingment question : 2
*/
class Demo {

    float m1(int a) {
        float result1 = a + 100.5f;
        return result1;

    }

}

class Sample {

    float m2(float b) {
        float result2 = b + 200;
        return result2;
    }

}

class NonStaticMethodEx04 {
    int a = 10;
    static float b = 20.5f;

    public static void main(String args[]) {
        Demo demo = new Demo();
        Sample sample = new Sample();
        NonStaticMethodEx04 nonStaticMethod4 = new NonStaticMethodEx04();

        float result1 = demo.m1(nonStaticMethod4.a);
        float result2 = sample.m2(NonStaticMethodEx04.b);

        float result = result1 + result2;

        System.out.println(result);

    }

}
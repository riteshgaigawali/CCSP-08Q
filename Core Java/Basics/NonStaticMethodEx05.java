/* Assingment question : 3 */
class A {
    int a = 100, b = 200;
}

class B {
    float p = 150.5f, q = 250.5f;
}

class X {

    float m1() {
        A objA = new A();
        B objB = new B();

        float result1 = objA.a + objB.p;
        return result1;

    }

}

class Y {

    float m2() {
        A objA = new A();
        B objB = new B();

        float result2 = objA.b + objB.q;
        return result2;

    }

}

class NonStaticMethodEx05 {
    public static void main(String args[]) {

        X objX = new X();
        Y objY = new Y();

        float result1 = objX.m1();
        float result2 = objY.m2();

        float result = result1 + result2;

        System.out.println(result);

    }

}
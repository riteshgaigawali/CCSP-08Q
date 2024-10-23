/*
- A Float variable can store floating point data which is decimal numbers.
- In Float variable we cannot store characters, or boolean values.
- Float will consume 4byte (eg. 32-bits ) and stores Approximately ±3.4028235E+38.
- To represent the litral in float type we need to suffix the letter 'f/F'.
*/
class DataTypesEx07 {
    public static void main(String args[]) {
        float f1 = 100.5f;
        System.out.println(f1);
        float f2 = 200.5F;
        System.out.println(f2);
        double d1 = 300.5;
        System.out.println(d1);
        double d2 = 400.5f;
        System.out.println(d2);
    }
}
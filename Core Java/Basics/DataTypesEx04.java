/*
- A Short variable can store integer data which is whole numbers.
- In Short variable we cannot store decimal values, characters, or boolean values.
- Short will consume 2byte (eg. 16-bits ) and ranges from -32,768 to 32,767. (eg. -2^15 to 2^15-1)
*/

class DataTypesEx04 {

    public static void main(String args[]) {
        short var1 = 32767;
        System.out.println(var1);
        // short var2 =32768; CTE
        short var3 = -32768;
        System.out.println(var3);
        // short var4= -32769; CTE

    }
}
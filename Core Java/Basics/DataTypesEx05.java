/*
- A Integer variable can store integer data which is whole numbers.
- In Integer variable we cannot store decimal values, characters, or boolean values.
- Integer will consume 4byte (eg. 32-bits ) and ranges from -2,147,483,648 to 2,147,483,647. (eg. -2^31 to 2^31-1)
*/
class DataTypesEx05 {
    public static void main(String args[]) {
        int var1 = 2147403647;
        System.out.println(var1);
        // int var2 = 2147403648; CTE
        int var3 = -2147403648;
        System.out.println(var3);
        // int var4=-2147403649; CTE

    }

}
/*
- Any constant value which can be assigned to the variable is called literal/constant.
 - There are four types of litrals supported in Java :-
 1. Decimal
 2. Octal
 3. Hexadecimal
 4. Binary
 */
class Literals {
    public static void main(String args[]) {

        int var1 = 10; // Decimal -> 0-9 -> base 10
        int var2 = 010; // Octal -> 0-7 -> base 8
        int var3 = 0X10; // Hex -> 0-15 -> base 16
        int var4 = 0b1111; /*
                            * From 1.7 onward, we can specify literal value even in binary form also,
                            * allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B.
                            */

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
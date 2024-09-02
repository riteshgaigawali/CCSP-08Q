/*
- Whenever we declare a variable it is mandatory to define it's datatype.
- With the same area (main area) we can't declare two variables with the same name.
- Byte will consume 1byte (eg. 8-bits ) and ranges from -128 to 127. (eg. -2^7 to 2^7-1)

*/

class Byte3{
public static void main(String args[]){
byte var1=127;
byte var2 = -128;
// byte var3 = 128; //This will generate CTE as it exeeds the range.
// byte var4 = -129;//This will generate CTE as it exeeds the range.

}
}
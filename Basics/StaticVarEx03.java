/*
 - With your experience as developer/tester can you tell me where exactly are static variables created ?
 --> Inside the RAM the static variables are created in static-pool, which is the part of heap.
 */
class StaticVarEx03 {
    static int a = 100;

    public static void main(String args[]) {
        float x = 200.5f;

        float result = a + x;

        System.out.print(result);

    }

}
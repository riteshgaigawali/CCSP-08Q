/*
  - When we create a non-static reference variable of same class in that same class itself it gives the StackOverFlowError.
  - Because whenever we create an object of that class the non-static members are loaded within the object inside the memory.
  - As non-static reference variable is also an object of that same class it will also load the non-static members within itself inside the memory.
  - This proccess is recursive hence  to avoid such situation the StackOverFlowError is given by Java .
 */
class NonStaticRefVarEx03 {
    NonStaticRefVarEx03 ref = new NonStaticRefVarEx03(); // This line will cause 'StackOverflowError'

    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        NonStaticRefVarEx03 ref1 = new NonStaticRefVarEx03();
        System.out.println("Stop @Cyber Success");
    }

}
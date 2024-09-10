//Single Inheritance
class Parent {
    int a = 100;
}

class Child extends Parent {
    float b = 20.5f;
}

class InheritanceEx1 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");

        // Parent
        Parent p1 = new Parent();
        System.out.println(p1.a);
        // System.out.println(p1.b); Error : cannot access child member with parent
        // class object

        // Child
        Child c1 = new Child();
        System.out.println(c1.b);
        System.out.println(c1.a);
        System.out.println("Stop @Cyber Success");
    }

}
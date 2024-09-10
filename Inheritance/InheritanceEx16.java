class Parent {
    Parent(int a) {
        System.out.println("Inside 1 args constructor. - Parent " + a);
    }
}

class Child extends Parent {
    Child() {
        // super(); error: constructor Parent in class Parent cannot be applied to given
        // types
        System.out.println("Inside 0 args constructor. - Child");
    }
}

class InheritanceEx16 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child();
        System.out.println("Stop @Cyber Success");
    }
}
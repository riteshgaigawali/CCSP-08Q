class Parent {
    static {
        System.out.println("Inside static block. - Parent");
    }
}

class Child extends Parent {
    static {
        System.out.println("Inside static block. - Child");
    }
}

class InheritanceEx20 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child();
        System.out.println("Stop @Cyber Success");
    }
}
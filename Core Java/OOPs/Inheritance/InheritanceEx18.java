class Parent {
    {
        System.out.println("Inside non-static/instance block. - Parent");
    }

    Parent() {
        System.out.println("Inside 0 args constructor. - Parent");
    }
}

class Child extends Parent {
    {
        System.out.println("Inside non-static/instance block. - Child");
    }

    Child() {
        System.out.println("Inside 0 args constructor. - Child");
    }
}

class InheritanceEx18 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child();
        System.out.println("Stop @Cyber Success");
    }
}
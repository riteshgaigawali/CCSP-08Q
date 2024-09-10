class Parent {
    Parent() {
        System.out.println("Inside 0 args constructor. - Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Inside 0 args constructor. - Child");
    }

    Child(int a) {
        super();
        this();// CTE : this() should be the first statement in constructor.
        System.out.println("Inside 1 args constructor. - Child");
    }
}

class SuperKeywordEx5 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c = new Child(10);
        System.out.println("Stop @Cyber Success");
    }
}
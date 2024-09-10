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
        System.out.println("Inside 1 args constructor. - Child " + a);// 20
    }
}

class InheritanceEx17 {
    public static void main(String args[]) {
        System.out.println("Start @Cyber Success");
        Child c1 = new Child();
        Child c2 = new Child(20);
        System.out.println("Stop @Cyber Success");
    }
}
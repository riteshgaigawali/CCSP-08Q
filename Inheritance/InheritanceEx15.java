class Parent {
	Parent() {
		System.out.println("Inside 0 args constructor. - Parent");
	}

	Parent(int a) {
		System.out.println("Inside 1 args constructor. - Parent");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Inside 0 args constructor. - Child");
	}
}

class InheritanceEx15 {
	public static void main(String args[]) {
		System.out.println("Start @Cyber Success");
		Child c = new Child();
		System.out.println("Stop @Cyber Success");
	}
}
class A {
    private int fun() {
        return 0;
    }

    private int foo() {
        return 1;
    }

    private int nuclear() {
        return 2;
    }

    void main() {
        A a = new A();
        B b = new B();
        int j = fun() + foo() + nuclear() + B.boo() + this.foo();
    }
}

class B {
    public static int boo() {
        return 100;
    }
}
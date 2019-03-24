class A {
    int fun() {
        return 0;
    }

    int foo() {
        return 1;
    }

    int nuclear() {
        return 2;
    }

    void main() {
        int j = fun() + foo() + nuclear() + B.boo() + this.foo();
    }
}

class B {
    static int boo() {
        return 100;
    }
}
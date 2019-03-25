class A {
    private static int foo() {}
}

class B {
    int fun() {
        return A.foo();
    }
}
class A {
    B b;

    private static A a(A a) {
        return A.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a;
    }
}

class B {
    A a;

    private static B b(B b) {
        return B.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b;
    }
}
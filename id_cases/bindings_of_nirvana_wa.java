class A {
    B b;

    private A a(A a) {
        return A.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a;
    }
}

class B {
    A a;

    private B b(B b) {
        return B.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b;
    }
}
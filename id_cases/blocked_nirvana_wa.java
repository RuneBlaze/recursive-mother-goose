class A {
    private B b;

    private A a(A a) {
        return this.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a;
    }
}

class B {
    A a;

    private B b(B b) {
        return this.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b;
    }
}
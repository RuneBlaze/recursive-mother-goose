class A {
    static B b;

    private A a(A a) {
        return this.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a;
    }
}

class B {
    static A a;

    private B b(B b) {
        return this.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b;
    }
}
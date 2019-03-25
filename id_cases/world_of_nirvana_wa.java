class A {
    static B b;

    private A a(A a) {
        return this.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a;
    }
}

class B {
    A a;

    private static B b(B b) {
        return a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b.a.b;
    }
}
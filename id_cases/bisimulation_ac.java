class A {
    B b;

    private A a(A a) {
        return this.b.a();
    }
}

class B {
    A a() {return null;}

    private A b(B b) {
        return this.a();
    }
}
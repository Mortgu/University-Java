package de.oskar.exercises;

public class Test {

    public Test() {
        A x = new B();
        x.f();
        //x.g();
        B y = (B)x;
        y.g();
        B z = new C();
        z.f();
        z.g();
        z.h();
    }

    class A {
        public void f() { System.out.println("A.f()"); }
        public void h() { System.out.println("A.h()"); }
    }
    class B extends A {
        public void f() { System.out.println("B.f()"); }
        public void g() { System.out.println("B.g()"); }
    }
    class C extends B {
        public void g() { System.out.println("C.g()"); }
    }
}

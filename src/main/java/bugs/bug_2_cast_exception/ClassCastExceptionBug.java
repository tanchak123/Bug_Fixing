package main.java.bugs.bug_2_cast_exception;

import java.io.IOException;

public class ClassCastExceptionBug {

    public static void main(String[] args) {
        // first class B constr(not touch) -> class A constr(not touch) -> class A a = 10 -> class A constr(a = 74) ->
        // class B a = 20 ->  class B constr( a = 54)
        // perfect info :)
        A a = new B();
        System.out.println(a.a);
        B b = new B();
        System.out.println(b.a);
        System.out.println(((A) b).a);
        // perfect info :) ty!
    }
}

class A {

    int a = 10;
    public A() {
        a = 74;
    }
    public void doSomething() {
        System.out.println("class A");
    }

}

class B extends A {

    int a = 20;
    public B() {
        a = 54;
    }
    public void doSomething() {
        System.out.println("class B");
    }

}

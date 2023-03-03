package chapter3.ch15.myclass;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("x()");
    }

    @Override
    public void x() {
        System.out.println("y()");
    }

    @Override
    public void y() {
        System.out.println("myMethod()");
    }
}

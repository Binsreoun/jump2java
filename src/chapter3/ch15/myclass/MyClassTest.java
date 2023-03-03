package chapter3.ch15.myclass;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        MyClass iClass = myClass;
        iClass.y();
        iClass.x();
        iClass.myMethod();
    }
}

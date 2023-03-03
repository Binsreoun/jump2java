package chapter3.ch15.customer;

public interface Buy {

    void buy();

    default void oder(){
        System.out.println("buy oder");
    }
}

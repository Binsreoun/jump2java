package chapter3.ch15.myclass;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell oder");
    }
}

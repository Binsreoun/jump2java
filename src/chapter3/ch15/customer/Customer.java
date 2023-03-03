package chapter3.ch15.customer;

import chapter3.ch15.myclass.Sell;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void oder() {
        System.out.println("customer oder");
    }

    public void hello() {
        System.out.println("hello");
    }
}

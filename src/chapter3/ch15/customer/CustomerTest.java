package chapter3.ch15.customer;

import chapter3.ch15.myclass.Sell;

public class  CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.oder();
        customer.hello();

        Buy buyer = customer;
        buyer.oder();
        buyer.buy();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}

package com.design.patterns.behavioral.strategy.first.example;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("54235", 50);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal
        cart.pay(new PaypalStrategy("myemail@example,com", "mypwd"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("Rhye G", "1232141242134214", "234", "12/19"));
    }
}

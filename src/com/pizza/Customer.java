package com.pizza;

public class Customer {

    private PepperoniPizza pepperoni;
    private PlainPizza plain;

    public void Order()
    {
        PizzaStore store = new PizzaStore();
        pepperoni = store.OrderPepperoniPizza();
        plain = store.OrderPlainPizza();
        InspectPizzaToppings();
    }

    private void InspectPizzaToppings()
    {
        System.out.println(pepperoni.Toppings);
        System.out.println(plain.Toppings);
    }

}

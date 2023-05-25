package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer();
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pepperoni");
        pizzas.add("Plain Pizza");
        pizzas.add("Hawaiian");
        pizzas.add("Four Cheese");
        customer.Order(pizzas);

    }
}

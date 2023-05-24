package com.pizza;

import com.pizza.food.Pizza;

import java.util.List;

public class Customer {

    private List<Pizza> order;
    private List<String> pizzaNames;
    public List<Pizza> Order(List<String> pizzas) throws Exception
    {
        this.pizzaNames = pizzas;
        PizzaStore store = new PizzaStore();
        order = store.Order(pizzas);
        InspectPizzaToppings();
        return order;
    }

    private void InspectPizzaToppings()
    {
        for(Pizza pizza: order){
            System.out.println("You ordered a " + pizzaNames.get(order.indexOf(pizza)) +" pizza!\nThe toppings you spot on it are: " + pizza.getToppings());
            System.out.println();
        }
    }

}

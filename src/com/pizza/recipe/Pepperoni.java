package com.pizza.recipe;

import java.util.ArrayList;
import java.util.List;

public class Pepperoni implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public Pepperoni()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        Toppings.add("Pepperoni");
    }
    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}

package com.pizza.recipe;

import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public Hawaiian()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        Toppings.add("Ham");
        Toppings.add("Pineapple");
    }
    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}


package com.pizza.recipe;

import java.util.ArrayList;
import java.util.List;

public class Plain implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public Plain()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
    }

    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}


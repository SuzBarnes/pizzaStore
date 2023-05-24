package com.pizza.recipe;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaRecipe implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public HawaiianPizzaRecipe()
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


package com.pizza.recipe;

import com.pizza.recipe.Recipe;

import java.util.ArrayList;
import java.util.List;

public class FourCheese implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public FourCheese() {
        Toppings.add("Parmesan");
        Toppings.add("Mozzarella");
        Toppings.add("Blue Cheese");
        Toppings.add("Fontina");
        Toppings.add("Tomato sauce");
    }
    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}